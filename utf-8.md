---
layout: page
title: Sind meine Dateien UTF-8 kodiert?
link_title: UTF-8?
---
Um zu Testen ob eine Datei wirklich UTF-8 kodiert ist gibt es je nach Betriebssystem verschiedene Möglichkeiten.

Zu Beachten ist aber auch, das Aufgrund der Abwärtskompatibilität jede UTF-8 kodierte Datei ohne
besondere Symbole (z.B. Umlaute oder Emoji) automatisch auch ASCII-kodiert ist und da ASCII-kodierte
Dateien keine besonderen Symbole enthalten können ist damit auch jede ASCII-kodierte Datei automatich UTF-8 kodiert.

Wenn eure Datei also keine Umlaute oder andere Symbole enthält braucht ihr euch über die Kodierung keine Gedanken zu machen.

**Achtung:** ANSI ist nicht dasselbe wie ASCII. Wenn eure Datei Umlaute enthält sollte sie auf jeden Fall UTF-8 kodiert sein.
**Besonders ist ANSI, Windows-1250 oder eine ISO-kodierung falsch**.

## Windows
#### Mit Notepad
Öffne die Datei mit `Notepad`, dem Windows Standard-Editor. Drücke `Datei > Speichern unter`:

![Screenshot Notepad->Speichern unter]({{ "/assets/img/editor-save-as.png" | absolute_url }})

Ganz unten steht unter `Codierung` die aktuelle Kodierung der Datei.
**Achtung:** `Notepad` unterscheidet nicht zwischen `UTF-8` mit `BOM-Header` und ohne
und fügt beim speichern immer einen ein.

Zum Umwandeln der Kodierung sollte man also besser Texteditoren wie `Notepad++` verwenden.
Am Besten solltet ihr aber eure IDE so einstellen, dass sie die Dateien gleich korrekt kodiert.
**Teilweise wirkt sich eine geänderte Kodierung in eurer IDE aber nur auf neue Dateien aus.**

#### Mit Notepad++
`Notepad++` ist ein Texteditor mit deutlich mehr Features als `Notepad`.
Dafür ist er aber auch nicht standardmäßig auf Windows installiert.
Mit `Notepad++` lässt sich auch leicht die Kodierung einer Datei verändern.

Wenn man eine Datei in `Notepad++` öffnet kann man unten rechts die Kodierung sehen.
Wenn die Datei einen `BOM-Header` enthält steht dort `UTF-8 BOM`, sonst nur `UTF-8`.
Um den Header zu entfernen oder die Kodierung zu ändern klicke in der Menüleiste oben
auf `Kodierung`, wähle `Konvertiere zu UTF-8` aus und speicher.

## MacOS und Linux
Unter MacOS und Linux kann man die Kodierung einer Datei mit dem Kommando `file` ansehen.
Öffne dazu ein `Terminal`, wechsle in den richtigen Ordner und führe `file MeinProgramm.java`
aus.

![Screenshot Terminal file]({{ "/assets/img/file-utf8.png" | absolute_url }})

Die korrekte Kodierung für das PGdP ist `UTF-8 Unicode text`.
Teilweise werden zusätzlich zur Kodierung noch andere Informationen (z.B. Zeilenendungen) angezeigt.
Wenn die Datei einen `BOM-Header` hat wird `UTF-8 Unicode (with BOM) text`.
Um den Header zu entfernen könnt ihr z.B. das Kommando `dos2unix` benutzen.

Am Besten solltet ihr aber eure IDE so einstellen, dass sie die Dateien gleich korrekt kodiert.
**Teilweise wirkt sich eine geänderte Kodierung in eurer IDE aber nur auf neue Dateien aus.**

Siehe auch: [Wie benutze ich das Terminal?](terminal-how-to)
