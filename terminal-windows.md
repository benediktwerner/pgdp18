---
layout: page
title: Kommandozeile unter Windows
---
### Die Kommandozeile öffnen
Es gibt je nach Windows Version verschieden Möglichkeiten:
1. **Alle Windows Versionen:** Drücke <kbd><i class="fa fa-windows"></i></kbd> + <kbd>R</kbd>, gib `cmd` ein und bestätige mit <kbd>Enter</kbd>.
3. **Alle Windows Versionen:** Klicke in einem Explorer-Fenster auf die Adressleiste, gib `cmd` ein und bestätige mit <kbd>Enter</kbd>. Das öffnet die Kommandozeile in dem selben Ordner wie das Explorer-Fenster.
2. **Windows 10:** Öffne die Suchleiste (drücke <kbd><i class="fa fa-windows"></i></kbd>), gib `cmd` ein und bestätige mit <kbd>Enter</kbd>.

Es sollte sich ein Fenster öffnen, dass in etwa so aussieht:

![Screenshot Kommandozeile]({{ "/assets/img/cmd.png" | relative_url }})

Der Teil vor dem Pfeil `>` gibt an in welchem Ordner wir uns gerade befinden. In dem Bild oben also im Ordner `C:\Users\Benedikt`, also auf dem Laufwerk `C` im Ordner `Users` und Unterordner `Bene`.

Hinter dem Pfeil `>` kann man einen Befehl eingeben und dann mit <kbd>Enter</kbd> ausführen.

### Zu einem anderen Ordner wechseln
`cd MeinProjekt` wechselt in den Unterordner `MeinProjekt`.

`cd` steht hier für "**C**ange **D**irectory".

Um in einen tieferne Unterordner zu wechseln kann man diese mit `\` getrennt angeben <br />
z.B. `cd workspace\MeinProjekt`

Um einen Ordner nach oben zu gehen benutzt man `..`. `cd ..\..\AnderesProjekt`
geht also zwei Ordner nach oben und wechselt dann in den Ordner `AnderesProjekt`.

Um von der Basis des Laufwerks anzufangen beginnt man mit `\`, z.B. `cd \Users\Bene\Documents`

Ein vorangestellter Laufwerksbuchstabe wie `C:` oder `D:` wird ignoriert, <br />
es geht also auch `cd C:\Users\Bene\Documents`

### Laufwerk wechseln
Um das Laufwerk zu wechseln gibt einfach den Laufwerksbuchstaben gefolgt von einem Doppelpunkt ein: z.B. `C:`

### Alle Dateien im aktuellen Ordner anzeigen
`dir` zeigt alle Dateien im aktuellen Ordner an.

### Autovervollständigung
Drücke <kbd>Tab</kbd> (die Taste oben links mit den zwei entgegengesetzten Pfeilen) um eine angefangene Eingabe automatisch zu vervollständigen.

z.B.: `cd MeinPro` + <kbd>Tab</kbd> = `cd MeinProjekt`

Wiederholtes drücken wechselt durch eventuell vorhandene Möglichkeiten:

`cd Do` + <kbd>Tab</kbd> = `cd Documents` + <kbd>Tab</kbd> = `cd Downloads`

### Einen Befehl nochmal ausführen
Mit den Pfeiltasten <kbd><i class="fa fa-arrow-up"></i></kbd> und <kbd><i class="fa fa-arrow-down"></i></kbd> kann man durch vorher
eingegebene Befehle wechseln und diese mit <kbd>Enter</kbd> nochmal ausführen.

### Eine Datei ansehen
Mit dem Befehl `type` kann man den Inhalt einer Datei ausgebn. z.B. `type HelloWorld.java`.
