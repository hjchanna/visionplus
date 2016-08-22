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

-- Dumping data for table mydb.bank_branch: ~0 rows (approximately)
/*!40000 ALTER TABLE `bank_branch` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_branch` ENABLE KEYS */;

-- Dumping data for table mydb.m_account: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_account` ENABLE KEYS */;

-- Dumping data for table mydb.m_brand: ~2 rows (approximately)
/*!40000 ALTER TABLE `m_brand` DISABLE KEYS */;
INSERT INTO `m_brand` (`index_no`, `name`) VALUES
	(1, 'rayban'),
	(2, 'hh');
/*!40000 ALTER TABLE `m_brand` ENABLE KEYS */;

-- Dumping data for table mydb.m_category: ~3 rows (approximately)
/*!40000 ALTER TABLE `m_category` DISABLE KEYS */;
INSERT INTO `m_category` (`index_no`, `name`) VALUES
	(1, 'frame'),
	(2, 'lencers'),
	(3, 'asaa');
/*!40000 ALTER TABLE `m_category` ENABLE KEYS */;

-- Dumping data for table mydb.m_customer: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_customer` ENABLE KEYS */;

-- Dumping data for table mydb.m_item: ~3 rows (approximately)
/*!40000 ALTER TABLE `m_item` DISABLE KEYS */;
INSERT INTO `m_item` (`index_no`, `brand`, `category`, `code`, `name`, `sale_price`, `cost_price`, `reorder_qty`) VALUES
	(4, NULL, NULL, '234', 'gdf', 500.00, 210.00, 101),
	(5, 1, 2, '321', 'ddd', 321.00, 123.00, 2),
	(7, 1, 1, '32', 'hh', 200.00, 200.00, 200);
/*!40000 ALTER TABLE `m_item` ENABLE KEYS */;

-- Dumping data for table mydb.m_payment_voucher: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_payment_voucher` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_payment_voucher` ENABLE KEYS */;

-- Dumping data for table mydb.m_stock: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_stock` ENABLE KEYS */;

-- Dumping data for table mydb.m_supplier: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_supplier` ENABLE KEYS */;

-- Dumping data for table mydb.m_user: ~0 rows (approximately)
/*!40000 ALTER TABLE `m_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `m_user` ENABLE KEYS */;

-- Dumping data for table mydb.store: ~0 rows (approximately)
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
/*!40000 ALTER TABLE `store` ENABLE KEYS */;

-- Dumping data for table mydb.t_account_transaction: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_account_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_account_transaction` ENABLE KEYS */;

-- Dumping data for table mydb.t_card_details: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_card_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_card_details` ENABLE KEYS */;

-- Dumping data for table mydb.t_cheque_details: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_cheque_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_cheque_details` ENABLE KEYS */;

-- Dumping data for table mydb.t_grn: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_grn` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_grn` ENABLE KEYS */;

-- Dumping data for table mydb.t_grn_item: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_grn_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_grn_item` ENABLE KEYS */;

-- Dumping data for table mydb.t_invoice: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice` ENABLE KEYS */;

-- Dumping data for table mydb.t_invoice_item1: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice_item1` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice_item1` ENABLE KEYS */;

-- Dumping data for table mydb.t_invoice_patient_infomation: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_invoice_patient_infomation` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_invoice_patient_infomation` ENABLE KEYS */;

-- Dumping data for table mydb.t_payment: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_payment` ENABLE KEYS */;

-- Dumping data for table mydb.t_stock_information: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_stock_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_stock_information` ENABLE KEYS */;

-- Dumping data for table mydb.t_stock_ledger: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_stock_ledger` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_stock_ledger` ENABLE KEYS */;

-- Dumping data for table mydb.t_transaction: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_transaction` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
