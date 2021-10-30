-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 30 oct. 2021 à 09:34
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `basketballtracer`
--

-- --------------------------------------------------------

--
-- Structure de la table `equipes`
--

DROP TABLE IF EXISTS `equipes`;
CREATE TABLE IF NOT EXISTS `equipes` (
  `idE` int(11) NOT NULL AUTO_INCREMENT,
  `nomEquipe` varchar(50) NOT NULL,
  `ville` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idE`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `equipes`
--

INSERT INTO `equipes` (`idE`, `nomEquipe`, `ville`) VALUES
(1, 'UOP', 'Pamiers'),
(2, 'PB15', 'Paris'),
(3, 'UMBB', 'Marseille'),
(4, 'TBC', 'Toulouse');

-- --------------------------------------------------------

--
-- Structure de la table `matchs`
--

DROP TABLE IF EXISTS `matchs`;
CREATE TABLE IF NOT EXISTS `matchs` (
  `idM` int(11) NOT NULL AUTO_INCREMENT,
  `idEquipe1` int(11) DEFAULT NULL,
  `idEquipe2` int(11) DEFAULT NULL,
  `dateMatch` date DEFAULT NULL,
  `adresse` varchar(50) DEFAULT NULL,
  `ville` varchar(50) DEFAULT NULL,
  `score1` int(11) DEFAULT NULL,
  `score2` int(11) DEFAULT NULL,
  PRIMARY KEY (`idM`),
  KEY `idEquipe1` (`idEquipe1`),
  KEY `idEquipe2` (`idEquipe2`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `matchs`
--

INSERT INTO `matchs` (`idM`, `idEquipe1`, `idEquipe2`, `dateMatch`, `adresse`, `ville`, `score1`, `score2`) VALUES
(1, 1, 4, '2021-08-25', '1 Boulevard Alsace Lorraine', 'Toulouse', 38, 26);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
