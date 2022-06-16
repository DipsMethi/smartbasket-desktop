-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2022 at 11:56 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `smartbasket_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `buyitems`
--

CREATE TABLE `buyitems` (
  `customerID` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cardid` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `buyitems`
--

INSERT INTO `buyitems` (`customerID`, `cardid`) VALUES
('7810312345678', '2112670'),
('', '2112670');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `checkin` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `checkout` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `total` decimal(65,2) NOT NULL,
  `isCardScanned` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `checkin`, `checkout`, `total`, `isCardScanned`) VALUES
('9401055364088', '3303653918', '3303656298', '241.30', 0),
('9401055364088', '3303655514', '3303656298', '241.30', 0),
('9401055364088', '3303655964', '3303656298', '241.30', 0),
('9201055364088', '3303657240', '3303657466', '111.85', 0);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `id` mediumtext COLLATE utf8_unicode_ci NOT NULL,
  `name` mediumtext COLLATE utf8_unicode_ci NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`id`, `name`, `price`) VALUES
('1508170', 'Coffee', 69.96),
('2706560', 'Milk', 45.95),
('2112670', 'Sugar', 35.95),
('1592790', 'Butter', 29.95),
('2062770', 'Bread', 15.5),
('2407060', 'Kelloggs', 149.9);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `type`) VALUES
(0, 'Admin'),
(1, 'Standard');

-- --------------------------------------------------------

--
-- Table structure for table `upref`
--

CREATE TABLE `upref` (
  `id` varchar(13) NOT NULL,
  `s_sms` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `upref`
--

INSERT INTO `upref` (`id`, `s_sms`) VALUES
('9401055364088', 0),
('7810312345678', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` varchar(13) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(7) NOT NULL,
  `cellNum` varchar(10) NOT NULL,
  `addr` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `status` text NOT NULL,
  `role_id` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstName`, `lastName`, `email`, `gender`, `cellNum`, `addr`, `password`, `status`, `role_id`) VALUES
('9201055364088', 'John', 'Doe', 'john@gmail.com', 'Male', '0795114017', 'Pretoria', 'doe', 'Active', b'1'),
('9401055364088', 'Dipolelo', 'Methi', 'dips@gmail.com', 'Male', '0761734815', 'Midrand, Joburg', 'dips', 'Active', b'0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`checkin`),
  ADD UNIQUE KEY `checkin` (`checkin`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
