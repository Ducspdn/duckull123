-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.27-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.2.0.6576
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for quan_li_diem
CREATE DATABASE IF NOT EXISTS `quan_li_diem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `quan_li_diem`;

-- Dumping structure for table quan_li_diem.quan_li_diem_sinh_vien
CREATE TABLE IF NOT EXISTS `quan_li_diem_sinh_vien` (
  `maThiSinh` int(11) NOT NULL,
  `tenThiSinh` varchar(50) DEFAULT '',
  `queQuan` varchar(50) DEFAULT '',
  `ngaySinh` varchar(50) DEFAULT '',
  `gioiTinh` varchar(50) DEFAULT '',
  `diemMon1` float DEFAULT 0,
  `diemMon2` float DEFAULT 0,
  `diemMon3` float DEFAULT 0,
  `diemtrungbinh` float DEFAULT 0,
  PRIMARY KEY (`maThiSinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.


-- Dumping database structure for quan_li_sinh_vien
CREATE DATABASE IF NOT EXISTS `quan_li_sinh_vien` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `quan_li_sinh_vien`;

-- Dumping structure for table quan_li_sinh_vien.lophoc
CREATE TABLE IF NOT EXISTS `lophoc` (
  `maLop` varchar(50) DEFAULT NULL,
  `tenLop` varchar(50) DEFAULT NULL,
  `tenKhoa` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

-- Dumping structure for table quan_li_sinh_vien.sinhvien
CREATE TABLE IF NOT EXISTS `sinhvien` (
  `maSinhVien` varchar(50) NOT NULL,
  `hoDem` varchar(50) NOT NULL,
  `ten` varchar(50) NOT NULL,
  `ngaySinh` date NOT NULL,
  `namNhapHoc` year(4) DEFAULT NULL,
  `mathuVien` varchar(50) DEFAULT NULL,
  UNIQUE KEY `maSinhVien` (`maSinhVien`) USING BTREE,
  UNIQUE KEY `mathuVien` (`mathuVien`) USING BTREE,
  CONSTRAINT `CONSTRAINT_1` CHECK (`namNhapHoc` >= 2020)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
