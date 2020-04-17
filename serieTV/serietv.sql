-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Creato il: Apr 09, 2020 alle 14:51
-- Versione del server: 5.7.26
-- Versione PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `serietv`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `film`
--

DROP TABLE IF EXISTS `film`;
CREATE TABLE IF NOT EXISTS `film` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `genere_id` int(11) NOT NULL,
  `attiva` tinyint(1) NOT NULL,
  `img` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `genere_id` (`genere_id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `film`
--

INSERT INTO `film` (`id`, `nome`, `genere_id`, `attiva`, `img`) VALUES
(1, 'Batman Begins', 1, 1, 'https://pad.mymovies.it/filmclub/2004/08/003/locandina.jpg'),
(2, 'Batman The Dark Knight', 2, 1, 'https://images-na.ssl-images-amazon.com/images/I/91KkWf50SoL._SL1500_.jpg'),
(3, 'Batman The Dark Knight Rises', 1, 1, 'https://i.pinimg.com/originals/16/a4/fb/16a4fb013d14399ef6bff2bfb81af3d1.jpg'),
(4, 'Inception', 1, 0, 'https://images-na.ssl-images-amazon.com/images/I/912AErFSBHL._SL1500_.jpg'),
(5, 'Interstellar', 2, 0, 'https://pad.mymovies.it/filmclub/2014/01/001/locandina.jpg'),
(6, 'Dunkirk', 2, 0, 'https://pad.mymovies.it/filmclub/2016/08/023/locandina.jpg'),
(7, 'Tenet', 1, 0, 'https://pad.mymovies.it/filmclub/2019/10/296/locandina.jpg'),
(8, 'Il Signore Degli Anelli la Compagnia Dell\'Anello', 1, 0, 'https://images-na.ssl-images-amazon.com/images/I/51B32VLk6uL._SY445_.jpg');

-- --------------------------------------------------------

--
-- Struttura della tabella `genere`
--

DROP TABLE IF EXISTS `genere`;
CREATE TABLE IF NOT EXISTS `genere` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `genere` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `genere`
--

INSERT INTO `genere` (`id`, `genere`) VALUES
(1, 'azione'),
(2, 'drammatico');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
