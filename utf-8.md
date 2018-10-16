---
layout: page
title: Sind meine Dateien UTF-8 kodiert?
link_title: UTF-8?
---
Um zu testen ob eine Datei wirklich UTF-8 kodiert ist gibt es je nach Betriebssystem verschiedene Möglichkeiten.
Zu beachten ist aber auch, das Aufgrund der Abwärtskompatibilität von UTF-8 eine UTF-8 kodierte Datei ohne
besondere Symbole (z.B. Umlaute) automatisch auch ASCII-kodiert ist.

## Windows
Öffne die Datei mit `Notepad`, dem Windows Standard-Editor. Drücke `Datei -> Speichern unter`:

![Screenshot Notepad->Speichern unter]({{ "/assets/img/editor-save-as.png" | absolute_url }})

Ganz unten steht unter `Codierung` die aktuelle Kodierung der Datei.
**Achtung:** `Notepad` unterscheidet nicht zwischen `UTF-8` mit `BOM-Header` und ohne
und fügt beim speichern immer einen ein.
Zum Umwandeln der Kodierung sollte man also besser Texteditoren wie `Notepad++` verwenden.

## MacOS und Linux
Unter MacOS und Linux kann man die Kodierung einer Datei mit dem Kommando `file` ansehen.
Öffne dazu ein `Terminal`, wechsle in den richtigen Ordner und führe `file MeinProgramm.java`
aus.

![Screenshot Terminal file]({{ "/assets/img/file-utf8.png" | absolute_url }})

Teilweise werden zusätzlich zur Kodierung noch andere Informationen (z.B. Zeilenendungen) angezeigt.

Siehe auch: [Wie benutze ich das Terminal?](terminal-how-to)
