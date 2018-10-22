---
layout: post
title:  Erste Stunde
#date:   2018-10-25 10:00:00 +0200
categories: pgdp stunde
---
<!--
### Folien
 - [Folien der erste Stunde]({{ "/assets/slides/pgdp-tutorium-1.pdf" | relative_url }}) -->

### Entwicklungsumgebung einrichten
#### Java installieren
Lade das Java Development Kit 11 (kurz JDK) von der
[Oracle-Website](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html){:target="_blank"}
herunter und installiere es.

Danach öffne eine Konsole ([Wie geht das?]({{ "/terminal" | relative_url }}))
und führe `java -version` aus. Wenn es keinen Fehler gibt und die korrekte Version angezeigt wird
hat die Installation funktioniert.

Unter Windows musst du eventuell noch Java zum Pfad hinzufügen:
1. Gehe im Explorer zu `C:\Program Files\Java`
2. Gehe in den Ordner der mit `jdk` anfängt und dannach in `bin`
3. Kopiere den aktuellen Pfad aus der Adressleiste
4. Öffne die Systemsteuerung, gehe zu `System und Sicherheit > System` und klicke auf `Einstellungen ändern` (rechts in der Mitte)
5. Gehe auf den Tab `Erweitert` und dann unten auf `Umgebungsvariablen`
6. Wähle die Variable `Path` aus, klicke auf `Bearbeiten > Neu` und füge den kopierten Pfad ein

#### Eclipse installieren
Lade Eclipse SimRel 2018-09 von der [Eclipse-Website](https://www.eclipse.org/downloads/) herunter und installiere es.
Wenn du beim installieren aus mehreren Versionen auswählen kannst ist die richtige Version `Eclipse for Java Developers`.

#### UTF-8 Kodierung einstellen
In `Eclipse` geht das unter `Window -> Preferences` bzw. `Eclipse -> Preferences` auf MacOS
und anschließend `General -> Workspace -> Text-file encoding -> Other -> UTF-8`.

**Achtung:** Die Änderung wirkt sich erst auf neue Dateien aus.

### Was ist der Unterschied zwischen `.java` und `.class` Dateien?
In Java gibt es zwei Arten von Dateien: `.java` und `.class`. `.java`-Dateien sind Quellcode Dateien,
also die Dateien die ein Programmierer erstellt und verändert.

`.class`-Dateien sind die vom Java-Compiler kompilierten binär-Dateien, welche man mit der Java Runtime ausführen kann.

Um `.java`-Dateien zu `.class`-Dateien zu kompilieren benutzt man den Java-Compiler `javac` z.B. `javac HelloWorld.java`.
Man erhält dann die kompilierte Datei `HelloWorld.class`. Diese kann man dann mit der Java Runtime ausführen: `java HelloWorld`.

IDEs wie `Eclipse` kompilieren `.java`-Dateien beim Speichern automatisch im Hintergrund, weshalb man davon
nichts mitbekommt. Meist befinden sich die `.java`-Dateien in dem Ordner `src` (für Sources, eng. für Quellen)
und die kompilierten `.class`-Dateien in dem Ordner `bin` (für Binaries) oder `build`.
