-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Creato il: Apr 20, 2020 alle 09:01
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
-- Database: `agenda_spring`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `appuntamenti`
--

DROP TABLE IF EXISTS `appuntamenti`;
CREATE TABLE IF NOT EXISTS `appuntamenti` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `utente_id` int(11) NOT NULL,
  `data` date NOT NULL,
  `ora_inizio` varchar(8) NOT NULL,
  `ora_fine` varchar(8) NOT NULL,
  `argomento` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idUtente` (`utente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `appuntamenti`
--

INSERT INTO `appuntamenti` (`id`, `utente_id`, `data`, `ora_inizio`, `ora_fine`, `argomento`) VALUES
(1, 1, '2020-04-20', '17:10', '18:00', 'Dentista'),
(2, 1, '2020-04-15', '15:00', '16:00', 'Gommista'),
(7, 1, '2020-04-20', '16:00', '17:00', 'Gommista'),
(8, 1, '2020-04-23', '15:00', '17:00', 'Fare la spesa'),
(9, 1, '2020-05-21', '09:00', '18:00', 'Pulire casa'),
(10, 1, '2020-04-18', '10:00', '12:00', 'Gommista'),
(11, 1, '2020-04-18', '14:00', '17:00', 'Dentista'),
(12, 1, '2020-04-18', '18:00', '20:00', 'altro');

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

DROP TABLE IF EXISTS `utente`;
CREATE TABLE IF NOT EXISTS `utente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cognome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`id`, `password`, `nome`, `cognome`) VALUES
(1, 'Roberto', 'Roberto', 'Bellardi');

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `appuntamenti`
--
ALTER TABLE `appuntamenti`
  ADD CONSTRAINT `appuntamenti_ibfk_1` FOREIGN KEY (`utente_id`) REFERENCES `utente` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
