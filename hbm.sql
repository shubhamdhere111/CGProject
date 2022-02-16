-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 16, 2022 at 07:12 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hbm`
--

-- --------------------------------------------------------

--
-- Table structure for table `alien`
--

CREATE TABLE `alien` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `alien`
--

INSERT INTO `alien` (`id`, `name`) VALUES
(101, 'shubham');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `compId` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`compId`, `name`) VALUES
(121, 'Dell');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `deptno` int(11) NOT NULL,
  `deptHead` varchar(255) DEFAULT NULL,
  `deptname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `empdetails`
--

CREATE TABLE `empdetails` (
  `eno` int(11) NOT NULL,
  `ename` varchar(255) DEFAULT NULL,
  `salary` bigint(20) NOT NULL,
  `deptno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empdetails`
--

INSERT INTO `empdetails` (`eno`, `ename`, `salary`, `deptno`) VALUES
(0, NULL, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `phonenumber`
--

CREATE TABLE `phonenumber` (
  `phone` int(11) NOT NULL,
  `number_type` varchar(255) DEFAULT NULL,
  `unid` int(11) DEFAULT NULL,
  `lst_indx` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phone_number`
--

CREATE TABLE `phone_number` (
  `phone` int(11) NOT NULL,
  `number_type` varchar(255) DEFAULT NULL,
  `unid` int(11) DEFAULT NULL,
  `lst_indx` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `pId` int(11) DEFAULT NULL,
  `productid` int(11) NOT NULL,
  `prodname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `price`, `type`, `pId`, `productid`, `prodname`) VALUES
(102, 'wire', 1020, 'usb', 121, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `quizbank`
--

CREATE TABLE `quizbank` (
  `id` int(11) NOT NULL,
  `Question` varchar(255) NOT NULL,
  `opection1` varchar(255) NOT NULL,
  `opection2` varchar(255) NOT NULL,
  `opection3` varchar(255) NOT NULL,
  `opection4` varchar(255) NOT NULL,
  `answer` varchar(255) NOT NULL,
  `marks` int(11) NOT NULL,
  `ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quizbank`
--

INSERT INTO `quizbank` (`id`, `Question`, `opection1`, `opection2`, `opection3`, `opection4`, `answer`, `marks`, `ans`) VALUES
(252, 'qweertt', 'q', 'w', 'e', 'r', 'e', 2, NULL),
(302, 'what', 'is', 'your', 'name', 'shubham', 'shubham', 12, NULL),
(352, 'what', 'is', 'java', 'a', 'b', 'c', 1, NULL),
(402, 'what', 'is', '12', '12', '12', '12', 1, NULL),
(452, 'shubham', '12', '13', '12', '12', '123', 12, NULL),
(502, 's', 's', 's', 's', 's', 's', 1, NULL),
(552, 'what', 'is', 'java', '1', '2', '3', 3, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `quizbank_seq`
--

CREATE TABLE `quizbank_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quizbank_seq`
--

INSERT INTO `quizbank_seq` (`next_val`) VALUES
(651);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `result`) VALUES
(102, 'shubham', 'mumbai');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` bigint(20) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `address`, `email`, `mobile`, `password`, `userName`, `role`) VALUES
(1, 'pune', 'shubham3255dhere@gmail.com', 9579303571, '12345678', 'shubham', NULL),
(52, 'p', 'p', 0, 'p', 'p', 'admin'),
(102, 'kolhapur', 'kalepsh1999@gmail.com', 7588363544, '12345678', 'kalpesh', 'developer');

-- --------------------------------------------------------

--
-- Table structure for table `user_seq`
--

CREATE TABLE `user_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_seq`
--

INSERT INTO `user_seq` (`next_val`) VALUES
(201);

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

CREATE TABLE `user_table` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`user_id`, `first_name`, `last_name`) VALUES
(101, 'shubham', 'Dhere'),
(102, 'shubham', 'Dhere');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alien`
--
ALTER TABLE `alien`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`compId`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`deptno`);

--
-- Indexes for table `empdetails`
--
ALTER TABLE `empdetails`
  ADD PRIMARY KEY (`eno`),
  ADD KEY `FKqawdhkw011da34nj04am9acsp` (`deptno`);

--
-- Indexes for table `phonenumber`
--
ALTER TABLE `phonenumber`
  ADD PRIMARY KEY (`phone`),
  ADD KEY `FKd64mx1w7rrs4s1pqy17ibiqkf` (`unid`);

--
-- Indexes for table `phone_number`
--
ALTER TABLE `phone_number`
  ADD PRIMARY KEY (`phone`),
  ADD KEY `FKi5uettecsit0bh0u0sft110np` (`unid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2x0y0cdnn285h9fx5k8aur11o` (`pId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_table`
--
ALTER TABLE `user_table`
  ADD PRIMARY KEY (`user_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `empdetails`
--
ALTER TABLE `empdetails`
  ADD CONSTRAINT `FKqawdhkw011da34nj04am9acsp` FOREIGN KEY (`deptno`) REFERENCES `department` (`deptno`);

--
-- Constraints for table `phonenumber`
--
ALTER TABLE `phonenumber`
  ADD CONSTRAINT `FKd64mx1w7rrs4s1pqy17ibiqkf` FOREIGN KEY (`unid`) REFERENCES `user_table` (`user_id`);

--
-- Constraints for table `phone_number`
--
ALTER TABLE `phone_number`
  ADD CONSTRAINT `FKi5uettecsit0bh0u0sft110np` FOREIGN KEY (`unid`) REFERENCES `user_table` (`user_id`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK2x0y0cdnn285h9fx5k8aur11o` FOREIGN KEY (`pId`) REFERENCES `company` (`compId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
