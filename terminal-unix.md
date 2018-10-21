---
layout: page
title: Terminal unter Linux/MacOS
---
### Das Terminal öffnen
Wie man das Terminal öffnet unterscheidet sich je nach Linux-Distribution etwas und es gibt meistens mehrere Möglichkeiten.

Unter vielen Linux Distributionen kann man <kbd>Strg</kbd> + <kbd>Alt</kbd> + <kbd>T</kbd> benutzen.

Unter MacOS kann man einfach das Programm `Terminal` über die Programmübersicht oder Spotlight (<kbd>Cmd</kbd> + <kbd>Leertaste</kbd>) öffnen.

Auch das Aussehen des Terminals unterscheidet sich je nach System.

Meistens stehen am Anfang der Zeile ein paar Informationen, dann kommt ein Trennsymbol (oft `$` für normale Benutzer und `#` wenn man root (also Administrator) ist) und dannach kann man etwas eingeben.

Normalerweise steht direkt vor dem Trennsymbol der Ordner in dem man sich gerade befindet.

Nach dem Trennsymbol kann man einen Befehl eingeben und diesen mit <kbd>Enter</kbd> ausführen.

### Aktuellen Ordner anzeigen
`pwd` zeigt den ganzen Pfad zum aktuellen Ordner an.

### Zu einem Ordner wechseln
`cd MeinProjekt` wechselt in den Unterordner `MeinProjekt`

`cd` steht hier für **C**ange **D**irectory.

Um in einen tieferne Unterordner zu wechseln kann man diese mit `/` getrennt angeben <br />
z.B. `cd workspace/MeinProjekt/src`

Um einen Ordner nach oben zu gehen benutzt man `..`

Mit `cd ..` geht man also einen Ordner nach oben
und mit `cd ../../AnderesProjekt` geht man zwei Ordner nach oben und wechselt dann in den Ordner `AnderesProjekt`.

Um von der Basis des Dateisystems anzufangen beginnt man mit `/`, z.B. `cd /home/bene/Documents`

### Alle Dateien im aktuellen Ordner anzeigen
`ls` zeigt alle sichtbaren Dateien im aktuellen Ordner an und steht für "**l**i**s**t (files)". Die Option `-a` zeigt
auch versteckte Dateien an (ganzer Befehl: `ls -a`), während die Option `-l` die Dateien in einer Liste untereinander anzeigt (ganzer Befehl: `ls -l`).

Man kann die Optionen auch kombinieren z.B. `ls -a -l` oder `ls -al` um alle Dateien, einschließlich Versteckter, in einer Liste anzuzeigen.

Unter einigen Linux-Distributionen kann man statt `ls -a` auch `la` und statt `ls -al` auch `ll` verwenden.

### Autovervollständigung
Drücke <kbd>Tab</kbd> (die Taste oben links mit den zwei entgegengesetzten Pfeilen) um eine angefangene Eingabe automatisch zu vervollständigen.

z.B.: `cd MeinPro` + <kbd>Tab</kbd> = `cd MeinProjekt`

Falls es mehrere Möglichkeiten gibt wird die Eingabe nicht vervollständigt. Wenn man nochmal <kbd>Tab</kbd> drückt
werden alle zur Eingabe passenden Möglichkeiten angezeigt.

### Einen Befehl nochmal ausführen
Mit den Pfeiltasten <kbd><i class="fa fa-arrow-up"></i></kbd> und <kbd><i class="fa fa-arrow-down"></i></kbd> kann man durch vorher
eingegebene Befehle wechseln und diese mit <kbd>Enter</kbd> nochmal ausführen.

### Eine Datei ansehen
`less HelloWorld.java` zeigt den Inhalt der Datei `HelloWorld.java` an.

Mit den Pfeiltasten <kbd><i class="fa fa-arrow-up"></i></kbd> und <kbd><i class="fa fa-arrow-down"></i></kbd> kann man scrollen und mit <kbd>Q</kbd> die Anzeige beenden.
