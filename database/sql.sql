-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.0.17-nt - MySQL Community Edition (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for mydb
DROP DATABASE IF EXISTS `mydb`;
CREATE DATABASE IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mydb`;


-- Dumping structure for table mydb.bank_branch
DROP TABLE IF EXISTS `bank_branch`;
CREATE TABLE IF NOT EXISTS `bank_branch` (
  `code` varchar(25) NOT NULL,
  `bank` varchar(50) default NULL,
  `branch` varchar(50) default NULL,
  PRIMARY KEY  (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.bank_branch: ~0 rows (approximately)
/*!40000 ALTER TABLE `bank_branch` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_branch` ENABLE KEYS */;


-- Dumping structure for table mydb.m_account
DROP TABLE IF EXISTS `m_account`;
CREATE TABLE IF NOT EXISTS `m_account` (
  `index_no` int(10) NOT NULL auto_increment,
  `description` varchar(50) default NULL,
  `type` varchar(25) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_account: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_account` ENABLE KEYS */;


-- Dumping structure for table mydb.m_brand
DROP TABLE IF EXISTS `m_brand`;
CREATE TABLE IF NOT EXISTS `m_brand` (
  `index_no` int(10) NOT NULL,
  `name` varchar(50) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_brand: ~2 rows (approximately)
/*!40000 ALTER TABLE `m_brand` DISABLE KEYS */;
REPLACE INTO `m_brand` (`index_no`, `name`) VALUES
	(1, 'rayban'),
	(2, 'hh');
/*!40000 ALTER TABLE `m_brand` ENABLE KEYS */;


-- Dumping structure for table mydb.m_category
DROP TABLE IF EXISTS `m_category`;
CREATE TABLE IF NOT EXISTS `m_category` (
  `index_no` int(10) NOT NULL,
  `name` varchar(50) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_category: ~3 rows (approximately)
/*!40000 ALTER TABLE `m_category` DISABLE KEYS */;
REPLACE INTO `m_category` (`index_no`, `name`) VALUES
	(1, 'frame'),
	(2, 'lencers'),
	(3, 'asaa');
/*!40000 ALTER TABLE `m_category` ENABLE KEYS */;


-- Dumping structure for table mydb.m_customer
DROP TABLE IF EXISTS `m_customer`;
CREATE TABLE IF NOT EXISTS `m_customer` (
  `index_no` int(10) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  `nic` varchar(25) default NULL,
  `address` varchar(100) default NULL,
  `contact_no` varchar(25) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_customer: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_customer` ENABLE KEYS */;


-- Dumping structure for table mydb.m_item
DROP TABLE IF EXISTS `m_item`;
CREATE TABLE IF NOT EXISTS `m_item` (
  `index_no` int(10) NOT NULL auto_increment,
  `brand` int(10) default NULL,
  `category` int(10) default NULL,
  `code` varchar(25) default NULL,
  `name` varchar(50) default NULL,
  `sale_price` double(10,2) default NULL,
  `cost_price` double(10,2) default NULL,
  `reorder_qty` int(10) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_m_item_m_brand1_idx` (`brand`),
  KEY `fk_m_item_m_category1_idx` (`category`),
  CONSTRAINT `fk_m_item_m_brand1` FOREIGN KEY (`brand`) REFERENCES `m_brand` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_m_item_m_category1` FOREIGN KEY (`category`) REFERENCES `m_category` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_item: ~3 rows (approximately)
/*!40000 ALTER TABLE `m_item` DISABLE KEYS */;
REPLACE INTO `m_item` (`index_no`, `brand`, `category`, `code`, `name`, `sale_price`, `cost_price`, `reorder_qty`) VALUES
	(4, NULL, NULL, '234', 'gdf', 500.00, 210.00, 101),
	(5, 1, 2, '321', 'ddd', 321.00, 123.00, 2),
	(7, 1, 1, '32', 'hh', 200.00, 200.00, 200);
/*!40000 ALTER TABLE `m_item` ENABLE KEYS */;


-- Dumping structure for table mydb.m_payment_voucher
DROP TABLE IF EXISTS `m_payment_voucher`;
CREATE TABLE IF NOT EXISTS `m_payment_voucher` (
  `index_no` date NOT NULL,
  `date` date default NULL,
  `description` varchar(25) default NULL,
  `amount` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_payment_voucher: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_payment_voucher` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_payment_voucher` ENABLE KEYS */;


-- Dumping structure for table mydb.m_stock
DROP TABLE IF EXISTS `m_stock`;
CREATE TABLE IF NOT EXISTS `m_stock` (
  `inde_no` date NOT NULL,
  `name` varchar(25) default NULL,
  PRIMARY KEY  (`inde_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_stock: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_stock` ENABLE KEYS */;


-- Dumping structure for table mydb.m_supplier
DROP TABLE IF EXISTS `m_supplier`;
CREATE TABLE IF NOT EXISTS `m_supplier` (
  `index_no` int(10) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `contact_no` varchar(25) default NULL,
  `email` varchar(50) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_supplier: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_supplier` ENABLE KEYS */;


-- Dumping structure for table mydb.m_user
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE IF NOT EXISTS `m_user` (
  `index_no` int(10) NOT NULL auto_increment,
  `name` varchar(25) NOT NULL,
  `user_name` varchar(25) default NULL,
  `password` varchar(25) NOT NULL,
  `type` varchar(25) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.m_user: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_user` ENABLE KEYS */;


-- Dumping structure for table mydb.store
DROP TABLE IF EXISTS `store`;
CREATE TABLE IF NOT EXISTS `store` (
  `index_no` int(10) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.store: ~0 rows (approximately)
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
/*!40000 ALTER TABLE `store` ENABLE KEYS */;


-- Dumping structure for table mydb.t_account_transaction
DROP TABLE IF EXISTS `t_account_transaction`;
CREATE TABLE IF NOT EXISTS `t_account_transaction` (
  `index_no` int(10) NOT NULL auto_increment,
  `date` date default NULL,
  `account` int(10) default NULL,
  `customer` int(10) default NULL,
  `supplier` int(10) default NULL,
  `description` varchar(50) default NULL,
  `debit` double(10,2) default NULL,
  `credit` double(10,2) default NULL,
  `transaction` int(10) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_account_transaction_transaction1_idx` (`transaction`),
  KEY `fk_t_account_transaction_account1_idx` (`account`),
  CONSTRAINT `fk_t_account_transaction_transaction1` FOREIGN KEY (`transaction`) REFERENCES `t_transaction` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_account_transaction_account1` FOREIGN KEY (`account`) REFERENCES `m_account` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_account_transaction: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_account_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_account_transaction` ENABLE KEYS */;


-- Dumping structure for table mydb.t_card_details
DROP TABLE IF EXISTS `t_card_details`;
CREATE TABLE IF NOT EXISTS `t_card_details` (
  `index_no` int(10) NOT NULL auto_increment,
  `payment` int(10) default NULL,
  `bank_branch` varchar(25) default NULL,
  `card_no` varchar(25) default NULL,
  `amount` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_card_details_t_payment1_idx` (`payment`),
  KEY `fk_t_card_details_bank_branch1_idx` (`bank_branch`),
  CONSTRAINT `fk_t_card_details_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_card_details_bank_branch1` FOREIGN KEY (`bank_branch`) REFERENCES `bank_branch` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_card_details: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_card_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_card_details` ENABLE KEYS */;


-- Dumping structure for table mydb.t_cheque_details
DROP TABLE IF EXISTS `t_cheque_details`;
CREATE TABLE IF NOT EXISTS `t_cheque_details` (
  `index_no` int(10) NOT NULL auto_increment,
  `payment` int(10) default NULL,
  `bank_branch` varchar(25) default NULL,
  `cheque_no` varchar(25) default NULL,
  `amount` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_cheque_details_t_payment1_idx` (`payment`),
  KEY `fk_t_cheque_details_bank_branch1_idx` (`bank_branch`),
  CONSTRAINT `fk_t_cheque_details_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_cheque_details_bank_branch1` FOREIGN KEY (`bank_branch`) REFERENCES `bank_branch` (`code`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_cheque_details: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_cheque_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_cheque_details` ENABLE KEYS */;


-- Dumping structure for table mydb.t_grn
DROP TABLE IF EXISTS `t_grn`;
CREATE TABLE IF NOT EXISTS `t_grn` (
  `index_no` int(10) NOT NULL auto_increment,
  `transaction` int(10) default NULL,
  `supplier` int(10) default NULL,
  `payment` int(10) default NULL,
  `date` date default NULL,
  `amount` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_grn_m_supplier1_idx` (`supplier`),
  KEY `fk_t_grn_t_payment1_idx` (`payment`),
  CONSTRAINT `fk_t_grn_m_supplier1` FOREIGN KEY (`supplier`) REFERENCES `m_supplier` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_grn_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_grn: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_grn` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_grn` ENABLE KEYS */;


-- Dumping structure for table mydb.t_grn_item
DROP TABLE IF EXISTS `t_grn_item`;
CREATE TABLE IF NOT EXISTS `t_grn_item` (
  `index_no` int(10) NOT NULL auto_increment,
  `grn` int(10) default NULL,
  `item` int(10) default NULL,
  `unit_price` double(10,2) default NULL,
  `qty` double(10,2) default NULL,
  `value` double(10,2) default NULL,
  `discount` double(10,2) default NULL,
  `net_value` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_grn_item_t_grn1_idx` (`grn`),
  KEY `fk_t_grn_item_m_item1_idx` (`item`),
  CONSTRAINT `fk_t_grn_item_t_grn1` FOREIGN KEY (`grn`) REFERENCES `t_grn` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_grn_item_m_item1` FOREIGN KEY (`item`) REFERENCES `m_item` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_grn_item: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_grn_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_grn_item` ENABLE KEYS */;


-- Dumping structure for table mydb.t_invoice
DROP TABLE IF EXISTS `t_invoice`;
CREATE TABLE IF NOT EXISTS `t_invoice` (
  `index_no` int(10) NOT NULL auto_increment,
  `transaction` int(10) default NULL,
  `customer` int(10) default NULL,
  `payment` int(10) default NULL,
  `patient_information` int(10) default NULL,
  `invoice_date` date default NULL,
  `amount` double(10,2) default NULL,
  `status` varchar(25) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_invoice_m_customer_idx` (`customer`),
  KEY `fk_t_invoice_t_payment1_idx` (`payment`),
  KEY `fk_t_invoice_t_invoice_patient_infomation1_idx` (`patient_information`),
  CONSTRAINT `fk_t_invoice_m_customer` FOREIGN KEY (`customer`) REFERENCES `m_customer` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_invoice_t_payment1` FOREIGN KEY (`payment`) REFERENCES `t_payment` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_invoice_t_invoice_patient_infomation1` FOREIGN KEY (`patient_information`) REFERENCES `t_invoice_patient_infomation` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_invoice: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice` ENABLE KEYS */;


-- Dumping structure for table mydb.t_invoice_item1
DROP TABLE IF EXISTS `t_invoice_item1`;
CREATE TABLE IF NOT EXISTS `t_invoice_item1` (
  `index_no` int(10) NOT NULL auto_increment,
  `invoice` int(10) default NULL,
  `item` int(10) default NULL,
  `unit_price` double(10,2) default NULL,
  `qty` int(10) default NULL,
  `value` double(10,2) default NULL,
  `discount` double(10,2) default NULL,
  `net_value` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_invoice_item_t_invoice1_idx` (`invoice`),
  KEY `fk_t_invoice_item_m_item1_idx` (`item`),
  CONSTRAINT `fk_t_invoice_item_t_invoice1` FOREIGN KEY (`invoice`) REFERENCES `t_invoice` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_invoice_item_m_item1` FOREIGN KEY (`item`) REFERENCES `m_item` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_invoice_item1: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice_item1` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice_item1` ENABLE KEYS */;


-- Dumping structure for table mydb.t_invoice_patient_infomation
DROP TABLE IF EXISTS `t_invoice_patient_infomation`;
CREATE TABLE IF NOT EXISTS `t_invoice_patient_infomation` (
  `index_no` int(10) NOT NULL auto_increment,
  `complains` varchar(25) default NULL,
  `hb_rx_left` varchar(25) default NULL,
  `hb_rx_right` varchar(25) default NULL,
  `hb_rx_sub_left` varchar(25) default NULL,
  `hb_rx_sub_right` varchar(25) default NULL,
  `auto_ref_left` varchar(25) default NULL,
  `auto_ref_right` varchar(25) default NULL,
  `ntc_left` varchar(25) default NULL,
  `ntc_right` varchar(25) default NULL,
  `va_without_glass_left` varchar(25) default NULL,
  `va_without_glass_right` varchar(25) default NULL,
  `va_with-p/h_left` varchar(25) default NULL,
  `va_with-p/h_right` varchar(25) default NULL,
  `va_with_glass_left` varchar(25) default NULL,
  `va_with_glass_right` varchar(25) default NULL,
  `dist_sph_left` varchar(25) default NULL,
  `dist_sph_right` varchar(25) default NULL,
  `dist_cyl_left` varchar(25) default NULL,
  `dist_cyl_right` varchar(25) default NULL,
  `dist_axis_left` varchar(25) default NULL,
  `dist_axis_right` varchar(25) default NULL,
  `near_sph_left` varchar(25) default NULL,
  `near_cyl_left` varchar(25) default NULL,
  `near_axis_left` varchar(25) default NULL,
  `near_sph_right` varchar(25) default NULL,
  `near_cyl_right` varchar(25) default NULL,
  `near_axis_right` varchar(25) default NULL,
  `lense_type` varchar(50) default NULL,
  `remarks` varchar(100) default NULL,
  `refractive_error` varchar(25) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_invoice_patient_infomation: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice_patient_infomation` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice_patient_infomation` ENABLE KEYS */;


-- Dumping structure for table mydb.t_payment
DROP TABLE IF EXISTS `t_payment`;
CREATE TABLE IF NOT EXISTS `t_payment` (
  `index_no` int(10) NOT NULL auto_increment,
  `transaction` int(10) default NULL,
  `total_amount` double(10,2) default NULL,
  `cash_amount` double(10,2) default NULL,
  `cheque_amount` double(10,2) default NULL,
  `card_amount` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_payment: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_payment` ENABLE KEYS */;


-- Dumping structure for table mydb.t_stock_information
DROP TABLE IF EXISTS `t_stock_information`;
CREATE TABLE IF NOT EXISTS `t_stock_information` (
  `item` date NOT NULL,
  `stock` date NOT NULL,
  `qty` date default NULL,
  PRIMARY KEY  (`item`,`stock`),
  KEY `fk_m_item_has_m_stock_m_stock1_idx` (`stock`),
  CONSTRAINT `fk_m_item_has_m_stock_m_stock1` FOREIGN KEY (`stock`) REFERENCES `m_stock` (`inde_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_stock_information: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_stock_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_stock_information` ENABLE KEYS */;


-- Dumping structure for table mydb.t_stock_ledger
DROP TABLE IF EXISTS `t_stock_ledger`;
CREATE TABLE IF NOT EXISTS `t_stock_ledger` (
  `index_no` int(10) NOT NULL auto_increment,
  `date` date default NULL,
  `store` int(10) default NULL,
  `item` int(10) default NULL,
  `in_qty` double(10,2) default NULL,
  `out_qty` double(10,2) default NULL,
  PRIMARY KEY  (`index_no`),
  KEY `fk_t_stock_ledger_m_item1_idx` (`item`),
  KEY `fk_t_stock_ledger_store1_idx` (`store`),
  CONSTRAINT `fk_t_stock_ledger_m_item1` FOREIGN KEY (`item`) REFERENCES `m_item` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_stock_ledger_store1` FOREIGN KEY (`store`) REFERENCES `store` (`index_no`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_stock_ledger: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_stock_ledger` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_stock_ledger` ENABLE KEYS */;


-- Dumping structure for table mydb.t_transaction
DROP TABLE IF EXISTS `t_transaction`;
CREATE TABLE IF NOT EXISTS `t_transaction` (
  `index_no` int(10) NOT NULL auto_increment,
  `date` date default NULL,
  `type` varchar(50) default NULL,
  PRIMARY KEY  (`index_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table mydb.t_transaction: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_transaction` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
