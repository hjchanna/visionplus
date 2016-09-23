-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.27 - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for mydb
DROP DATABASE IF EXISTS `mydb`;
CREATE DATABASE IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mydb`;


-- Dumping structure for view mydb.bal_qty
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `bal_qty` (
	`item` INT(10) NULL,
	`balQty` DOUBLE(19,2) NULL
) ENGINE=MyISAM;


-- Dumping structure for view mydb.bal_qty_b
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `bal_qty_b` (
	`item` INT(10) NULL,
	`balQty` DOUBLE(19,2) NULL
) ENGINE=MyISAM;


-- Dumping structure for view mydb.bal_qty_f
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `bal_qty_f` (
	`item` INT(10) NULL,
	`balQty` DOUBLE(19,2) NULL
) ENGINE=MyISAM;


-- Dumping structure for table mydb.bank_branch
CREATE TABLE IF NOT EXISTS `bank_branch` (
  `code` varchar(25) NOT NULL,
  `bank` varchar(50) DEFAULT NULL,
  `branch` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.bank_branch: ~1 rows (approximately)
/*!40000 ALTER TABLE `bank_branch` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_branch` ENABLE KEYS */;


-- Dumping structure for table mydb.customer_payment
CREATE TABLE IF NOT EXISTS `customer_payment` (
  `index_no` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `payment` int(10) NOT NULL,
  `invoice` int(10) NOT NULL,
  `is_advance` tinyint(1) DEFAULT NULL,
  KEY `fk_customer_payment_t_payment1_idx` (`payment`),
  KEY `fk_customer_payment_t_invoice1_idx` (`invoice`),
  KEY `index_no` (`index_no`),
  CONSTRAINT `fk_customer_payment_t_invoice1` FOREIGN KEY (`invoice`) REFERENCES `t_invoice` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_payment_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.customer_payment: ~0 rows (approximately)
/*!40000 ALTER TABLE `customer_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_payment` ENABLE KEYS */;


-- Dumping structure for table mydb.factory
CREATE TABLE IF NOT EXISTS `factory` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact_no` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.factory: ~1 rows (approximately)
/*!40000 ALTER TABLE `factory` DISABLE KEYS */;
REPLACE INTO `factory` (`index_no`, `name`, `address`, `contact_no`) VALUES
	(1, 'Default', 'N/N', '0000000000');
/*!40000 ALTER TABLE `factory` ENABLE KEYS */;


-- Dumping structure for view mydb.grn_search_item
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `grn_search_item` (
	`index_no` INT(10) NOT NULL,
	`code` VARCHAR(25) NULL COLLATE 'utf8_general_ci',
	`item_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`brand_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`category_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`sale_price` DOUBLE(10,2) NULL,
	`cost_price` DOUBLE(10,2) NULL,
	`isstock_item` TINYINT(1) NULL,
	`bal_qty` DOUBLE(19,2) NOT NULL
) ENGINE=MyISAM;


-- Dumping structure for table mydb.log_file
CREATE TABLE IF NOT EXISTS `log_file` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `time` varchar(25) DEFAULT NULL,
  `user` int(10) DEFAULT NULL,
  `form_name` varchar(25) DEFAULT NULL,
  `transaction_type` varchar(25) DEFAULT NULL,
  `value` double(10,2) DEFAULT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.log_file: ~0 rows (approximately)
/*!40000 ALTER TABLE `log_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `log_file` ENABLE KEYS */;


-- Dumping structure for table mydb.main_category
CREATE TABLE IF NOT EXISTS `main_category` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.main_category: ~0 rows (approximately)
/*!40000 ALTER TABLE `main_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `main_category` ENABLE KEYS */;


-- Dumping structure for table mydb.m_account
CREATE TABLE IF NOT EXISTS `m_account` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `type` varchar(25) DEFAULT NULL,
  `main_category` int(10) NOT NULL,
  `sub_category` int(10) NOT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_m_account_main_category1_idx` (`main_category`),
  KEY `fk_m_account_sub_category1_idx` (`sub_category`),
  CONSTRAINT `fk_m_account_main_category1` FOREIGN KEY (`main_category`) REFERENCES `main_category` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_m_account_sub_category1` FOREIGN KEY (`sub_category`) REFERENCES `sub_category` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_account: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_account` ENABLE KEYS */;


-- Dumping structure for table mydb.m_brand
CREATE TABLE IF NOT EXISTS `m_brand` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_brand: ~2 rows (approximately)
/*!40000 ALTER TABLE `m_brand` DISABLE KEYS */;
REPLACE INTO `m_brand` (`index_no`, `name`) VALUES
	(1, 'N/N');
/*!40000 ALTER TABLE `m_brand` ENABLE KEYS */;


-- Dumping structure for table mydb.m_category
CREATE TABLE IF NOT EXISTS `m_category` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_category: ~2 rows (approximately)
/*!40000 ALTER TABLE `m_category` DISABLE KEYS */;
REPLACE INTO `m_category` (`index_no`, `name`) VALUES
	(1, 'N/N');
/*!40000 ALTER TABLE `m_category` ENABLE KEYS */;


-- Dumping structure for table mydb.m_customer
CREATE TABLE IF NOT EXISTS `m_customer` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `nic` varchar(25) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact_no` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_customer: ~1 rows (approximately)
/*!40000 ALTER TABLE `m_customer` DISABLE KEYS */;
REPLACE INTO `m_customer` (`index_no`, `name`, `nic`, `address`, `contact_no`) VALUES
	(1, 'Default', '000000000V', 'N/N', '0000000000');
/*!40000 ALTER TABLE `m_customer` ENABLE KEYS */;


-- Dumping structure for table mydb.m_item
CREATE TABLE IF NOT EXISTS `m_item` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `brand` int(10) DEFAULT NULL,
  `category` int(10) DEFAULT NULL,
  `code` varchar(25) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sale_price` double(10,2) DEFAULT NULL,
  `cost_price` double(10,2) DEFAULT NULL,
  `reorder_qty` int(10) DEFAULT NULL,
  `isstock_item` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_m_item_m_brand1_idx` (`brand`),
  KEY `fk_m_item_m_category1_idx` (`category`),
  CONSTRAINT `fk_m_item_m_brand1` FOREIGN KEY (`brand`) REFERENCES `m_brand` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_m_item_m_category1` FOREIGN KEY (`category`) REFERENCES `m_category` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_item: ~2 rows (approximately)
/*!40000 ALTER TABLE `m_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_item` ENABLE KEYS */;


-- Dumping structure for table mydb.m_payment_voucher
CREATE TABLE IF NOT EXISTS `m_payment_voucher` (
  `index_no` date NOT NULL,
  `date` date DEFAULT NULL,
  `description` varchar(25) DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_payment_voucher: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_payment_voucher` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_payment_voucher` ENABLE KEYS */;


-- Dumping structure for table mydb.m_stock
CREATE TABLE IF NOT EXISTS `m_stock` (
  `inde_no` date NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`inde_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_stock: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_stock` ENABLE KEYS */;


-- Dumping structure for table mydb.m_supplier
CREATE TABLE IF NOT EXISTS `m_supplier` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `contact_no` varchar(25) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact_name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_supplier: ~1 rows (approximately)
/*!40000 ALTER TABLE `m_supplier` DISABLE KEYS */;
REPLACE INTO `m_supplier` (`index_no`, `name`, `contact_no`, `email`, `address`, `contact_name`) VALUES
	(1, 'Default', '0000000000', 'N/N', 'N/N', 'N/N');
/*!40000 ALTER TABLE `m_supplier` ENABLE KEYS */;


-- Dumping structure for table mydb.m_user
CREATE TABLE IF NOT EXISTS `m_user` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `user_name` varchar(25) DEFAULT NULL,
  `password` varchar(25) NOT NULL,
  `type` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_user: ~1 rows (approximately)
/*!40000 ALTER TABLE `m_user` DISABLE KEYS */;
REPLACE INTO `m_user` (`index_no`, `name`, `user_name`, `password`, `type`) VALUES
	(1, 'div', 'Q', 'Q', 'Admin');
/*!40000 ALTER TABLE `m_user` ENABLE KEYS */;


-- Dumping structure for view mydb.search_item_b
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `search_item_b` (
	`index_no` INT(10) NOT NULL,
	`code` VARCHAR(25) NULL COLLATE 'utf8_general_ci',
	`item_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`brand_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`category_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`sale_price` DOUBLE(10,2) NULL,
	`cost_price` DOUBLE(10,2) NULL,
	`isstock_item` TINYINT(1) NULL,
	`bal_qty` DOUBLE(19,2) NOT NULL
) ENGINE=MyISAM;


-- Dumping structure for view mydb.search_item_f
-- Creating temporary table to overcome VIEW dependency errors
CREATE TABLE `search_item_f` (
	`index_no` INT(10) NOT NULL,
	`code` VARCHAR(25) NULL COLLATE 'utf8_general_ci',
	`item_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`brand_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`category_name` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`sale_price` DOUBLE(10,2) NULL,
	`cost_price` DOUBLE(10,2) NULL,
	`isstock_item` TINYINT(1) NULL,
	`bal_qty` DOUBLE(19,2) NOT NULL
) ENGINE=MyISAM;


-- Dumping structure for table mydb.status
CREATE TABLE IF NOT EXISTS `status` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `invoice` int(10) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `transaction` int(10) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_status_t_invoice1_idx` (`invoice`),
  CONSTRAINT `fk_status_t_invoice1` FOREIGN KEY (`invoice`) REFERENCES `t_invoice` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.status: ~0 rows (approximately)
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
/*!40000 ALTER TABLE `status` ENABLE KEYS */;


-- Dumping structure for table mydb.store
CREATE TABLE IF NOT EXISTS `store` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.store: ~2 rows (approximately)
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
REPLACE INTO `store` (`index_no`, `name`) VALUES
	(1, 'FRONT'),
	(2, 'BULK');
/*!40000 ALTER TABLE `store` ENABLE KEYS */;


-- Dumping structure for table mydb.sub_category
CREATE TABLE IF NOT EXISTS `sub_category` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.sub_category: ~0 rows (approximately)
/*!40000 ALTER TABLE `sub_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_category` ENABLE KEYS */;


-- Dumping structure for table mydb.supplier_payment
CREATE TABLE IF NOT EXISTS `supplier_payment` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `payment` int(10) NOT NULL,
  `grn` int(10) NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_supplier_payment_t_payment1_idx` (`payment`),
  KEY `fk_supplier_payment_t_grn1_idx` (`grn`),
  CONSTRAINT `fk_supplier_payment_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_supplier_payment_t_grn1` FOREIGN KEY (`grn`) REFERENCES `t_grn` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.supplier_payment: ~0 rows (approximately)
/*!40000 ALTER TABLE `supplier_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier_payment` ENABLE KEYS */;


-- Dumping structure for table mydb.t_account_transaction
CREATE TABLE IF NOT EXISTS `t_account_transaction` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `account` int(10) DEFAULT NULL,
  `customer` int(10) DEFAULT NULL,
  `supplier` int(10) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `debit` double(10,2) DEFAULT NULL,
  `credit` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_account_transaction_account1_idx` (`account`),
  CONSTRAINT `fk_t_account_transaction_account1` FOREIGN KEY (`account`) REFERENCES `m_account` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_account_transaction: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_account_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_account_transaction` ENABLE KEYS */;


-- Dumping structure for table mydb.t_card_details
CREATE TABLE IF NOT EXISTS `t_card_details` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `payment` int(10) DEFAULT NULL,
  `bank_branch` varchar(25) DEFAULT NULL,
  `card_no` varchar(25) DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_card_details_t_payment1_idx` (`payment`),
  KEY `fk_t_card_details_bank_branch1_idx` (`bank_branch`),
  CONSTRAINT `fk_t_card_details_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_card_details_bank_branch1` FOREIGN KEY (`bank_branch`) REFERENCES `bank_branch` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_card_details: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_card_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_card_details` ENABLE KEYS */;


-- Dumping structure for table mydb.t_cheque_details
CREATE TABLE IF NOT EXISTS `t_cheque_details` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `payment` int(10) DEFAULT NULL,
  `bank_branch` varchar(25) DEFAULT NULL,
  `cheque_no` varchar(25) DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_cheque_details_t_payment1_idx` (`payment`),
  KEY `fk_t_cheque_details_bank_branch1_idx` (`bank_branch`),
  CONSTRAINT `fk_t_cheque_details_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_cheque_details_bank_branch1` FOREIGN KEY (`bank_branch`) REFERENCES `bank_branch` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_cheque_details: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_cheque_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_cheque_details` ENABLE KEYS */;


-- Dumping structure for table mydb.t_grn
CREATE TABLE IF NOT EXISTS `t_grn` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `supplier` int(10) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `ref_no` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_grn_m_supplier1_idx` (`supplier`),
  CONSTRAINT `fk_t_grn_m_supplier1` FOREIGN KEY (`supplier`) REFERENCES `m_supplier` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_grn: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_grn` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_grn` ENABLE KEYS */;


-- Dumping structure for table mydb.t_grn_item
CREATE TABLE IF NOT EXISTS `t_grn_item` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `grn` int(10) DEFAULT NULL,
  `item` int(10) DEFAULT NULL,
  `unit_price` double(10,2) DEFAULT NULL,
  `qty` double(10,2) DEFAULT NULL,
  `value` double(10,2) DEFAULT NULL,
  `discount` double(10,2) DEFAULT NULL,
  `net_value` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_grn_item_t_grn1_idx` (`grn`),
  KEY `fk_t_grn_item_m_item1_idx` (`item`),
  CONSTRAINT `fk_t_grn_item_t_grn1` FOREIGN KEY (`grn`) REFERENCES `t_grn` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_grn_item_m_item1` FOREIGN KEY (`item`) REFERENCES `m_item` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_grn_item: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_grn_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_grn_item` ENABLE KEYS */;


-- Dumping structure for table mydb.t_invoice
CREATE TABLE IF NOT EXISTS `t_invoice` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `customer` int(10) DEFAULT NULL,
  `factory` int(10) NOT NULL,
  `invoice_date` date DEFAULT NULL,
  `amount` double(10,2) DEFAULT NULL,
  `status` varchar(25) DEFAULT NULL,
  `isdelete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_invoice_m_customer_idx` (`customer`),
  KEY `fk_t_invoice_factory1_idx` (`factory`),
  CONSTRAINT `fk_t_invoice_m_customer` FOREIGN KEY (`customer`) REFERENCES `m_customer` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_invoice_factory1` FOREIGN KEY (`factory`) REFERENCES `factory` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_invoice: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice` ENABLE KEYS */;


-- Dumping structure for table mydb.t_invoice_item1
CREATE TABLE IF NOT EXISTS `t_invoice_item1` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `invoice` int(10) DEFAULT NULL,
  `item` int(10) DEFAULT NULL,
  `unit_price` double(10,2) DEFAULT NULL,
  `qty` int(10) DEFAULT NULL,
  `value` double(10,2) DEFAULT NULL,
  `discount` double(10,2) DEFAULT NULL,
  `net_value` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_invoice_item_t_invoice1_idx` (`invoice`),
  KEY `fk_t_invoice_item_m_item1_idx` (`item`),
  CONSTRAINT `fk_t_invoice_item_t_invoice1` FOREIGN KEY (`invoice`) REFERENCES `t_invoice` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_invoice_item_m_item1` FOREIGN KEY (`item`) REFERENCES `m_item` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_invoice_item1: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice_item1` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice_item1` ENABLE KEYS */;


-- Dumping structure for table mydb.t_invoice_patient_infomation
CREATE TABLE IF NOT EXISTS `t_invoice_patient_infomation` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `invoice` int(10) NOT NULL,
  `complains` varchar(100) DEFAULT NULL,
  `hb_rx_left` varchar(25) DEFAULT NULL,
  `hb_rx_right` varchar(25) DEFAULT NULL,
  `hb_rx_sub_left` varchar(25) DEFAULT NULL,
  `hb_rx_sub_right` varchar(25) DEFAULT NULL,
  `auto_ref_left` varchar(25) DEFAULT NULL,
  `auto_ref_right` varchar(25) DEFAULT NULL,
  `ntc_left` varchar(25) DEFAULT NULL,
  `ntc_right` varchar(25) DEFAULT NULL,
  `va_without_glass_left` varchar(25) DEFAULT NULL,
  `va_without_glass_right` varchar(25) DEFAULT NULL,
  `va_with_ph_left` varchar(25) DEFAULT NULL,
  `va_with_ph_right` varchar(25) DEFAULT NULL,
  `va_with_glass_left` varchar(25) DEFAULT NULL,
  `va_with_glass_right` varchar(25) DEFAULT NULL,
  `dist_sph_left` varchar(25) DEFAULT NULL,
  `dist_sph_right` varchar(25) DEFAULT NULL,
  `dist_cyl_left` varchar(25) DEFAULT NULL,
  `dist_cyl_right` varchar(25) DEFAULT NULL,
  `dist_axis_left` varchar(25) DEFAULT NULL,
  `dist_axis_right` varchar(25) DEFAULT NULL,
  `near_sph_left` varchar(25) DEFAULT NULL,
  `near_cyl_left` varchar(25) DEFAULT NULL,
  `near_axis_left` varchar(25) DEFAULT NULL,
  `near_sph_right` varchar(25) DEFAULT NULL,
  `near_cyl_right` varchar(25) DEFAULT NULL,
  `near_axis_right` varchar(25) DEFAULT NULL,
  `lense_type` varchar(50) DEFAULT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  `refractive_error` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_invoice_patient_infomation_t_invoice1_idx` (`invoice`),
  CONSTRAINT `fk_t_invoice_patient_infomation_t_invoice1` FOREIGN KEY (`invoice`) REFERENCES `t_invoice` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_invoice_patient_infomation: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice_patient_infomation` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice_patient_infomation` ENABLE KEYS */;


-- Dumping structure for table mydb.t_payment
CREATE TABLE IF NOT EXISTS `t_payment` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `transaction` int(10) DEFAULT NULL,
  `total_amount` double(10,2) DEFAULT NULL,
  `cash_amount` double(10,2) DEFAULT NULL,
  `cheque_amount` double(10,2) DEFAULT NULL,
  `card_amount` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_payment: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_payment` ENABLE KEYS */;


-- Dumping structure for table mydb.t_stock_information
CREATE TABLE IF NOT EXISTS `t_stock_information` (
  `item` date NOT NULL,
  `stock` date NOT NULL,
  `qty` date DEFAULT NULL,
  PRIMARY KEY (`item`,`stock`),
  KEY `fk_m_item_has_m_stock_m_stock1_idx` (`stock`),
  CONSTRAINT `fk_m_item_has_m_stock_m_stock1` FOREIGN KEY (`stock`) REFERENCES `m_stock` (`inde_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_stock_information: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_stock_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_stock_information` ENABLE KEYS */;


-- Dumping structure for table mydb.t_stock_ledger
CREATE TABLE IF NOT EXISTS `t_stock_ledger` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `store` int(10) DEFAULT NULL,
  `item` int(10) DEFAULT NULL,
  `qty` double(10,2) DEFAULT NULL,
  `form` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `fk_t_stock_ledger_m_item1_idx` (`item`),
  KEY `fk_t_stock_ledger_store1_idx` (`store`),
  CONSTRAINT `fk_t_stock_ledger_m_item1` FOREIGN KEY (`item`) REFERENCES `m_item` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_stock_ledger_store1` FOREIGN KEY (`store`) REFERENCES `store` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_stock_ledger: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_stock_ledger` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_stock_ledger` ENABLE KEYS */;


-- Dumping structure for view mydb.bal_qty
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `bal_qty`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `bal_qty` AS SELECT t_stock_ledger.item, Sum(t_stock_ledger.qty) AS balQty
FROM t_stock_ledger
GROUP BY t_stock_ledger.item ;


-- Dumping structure for view mydb.bal_qty_b
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `bal_qty_b`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `bal_qty_b` AS SELECT t_stock_ledger.item, Sum(t_stock_ledger.qty) AS balQty
FROM t_stock_ledger
where t_stock_ledger.store=2
GROUP BY t_stock_ledger.item ;


-- Dumping structure for view mydb.bal_qty_f
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `bal_qty_f`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `bal_qty_f` AS SELECT t_stock_ledger.item, Sum(t_stock_ledger.qty) AS balQty
FROM t_stock_ledger
where t_stock_ledger.store=1
GROUP BY t_stock_ledger.item ;


-- Dumping structure for view mydb.grn_search_item
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `grn_search_item`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `grn_search_item` AS SELECT m_item.index_no,m_item.code,m_item.name as item_name, m_brand.name as brand_name, m_category.name as category_name ,m_item.sale_price,m_item.cost_price,m_item.isstock_item, IFNULL(bal_qty.balQty,0.00) as bal_qty
FROM (m_category INNER JOIN (m_brand INNER JOIN m_item ON m_brand.index_no = m_item.brand) 
ON m_category.index_no = m_item.category) LEFT JOIN bal_qty ON m_item.index_no = bal_qty.item ;


-- Dumping structure for view mydb.search_item_b
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `search_item_b`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `search_item_b` AS SELECT m_item.index_no,m_item.code,m_item.name as item_name,m_brand.name as brand_name, m_category.name as category_name,m_item.sale_price,m_item.cost_price,m_item.isstock_item, IFNULL(bal_qty_b.balQty,0.00) as bal_qty
FROM (m_category INNER JOIN (m_brand INNER JOIN m_item ON m_brand.index_no = m_item.brand) ON m_category.index_no = m_item.category) LEFT JOIN bal_qty_b ON m_item.index_no = bal_qty_b.item ;


-- Dumping structure for view mydb.search_item_f
-- Removing temporary table and create final VIEW structure
DROP TABLE IF EXISTS `search_item_f`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` VIEW `search_item_f` AS SELECT m_item.index_no,m_item.code,m_item.name as item_name,m_brand.name as brand_name, m_category.name as category_name,m_item.sale_price,m_item.cost_price,m_item.isstock_item, IFNULL(bal_qty_f.balQty,0.00) as bal_qty
FROM (m_category INNER JOIN (m_brand INNER JOIN m_item ON m_brand.index_no = m_item.brand) ON m_category.index_no = m_item.category) LEFT JOIN bal_qty_f ON m_item.index_no = bal_qty_f.item ;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
