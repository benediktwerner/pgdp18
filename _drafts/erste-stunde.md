---
layout: post
title:  Erste Stunde
#date:   2018-10-26 10:00:00 +0200
categories: pgdp stunde
---
### Folien
- [Folien der erste Stunde]({{ "/assets/slides/pgdp-tutorium-1.pdf" | relative_url }})

### Entwicklungsumgebung einrichten
#### Java installieren
Java kann man von der [Java-Website](https://java.com/de/download/){:target="_blank"} herunterladen und dannach installieren.

#### JDK installieren
Um Java zu entwickeln muss man noch das Java Development Kit (kurz JDK) installieren.
Dieses kann man von der [Oracle-Website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html){:target="_blank"} herunterladen.

#### Eclipse installieren
Anschließend braucht man noch eine IDE. Wir empfehlen `Eclipse`, welches man auf der [Eclipse-Website](https://www.eclipse.org/downloads/) herunterladen kann.
Beim installieren kann man aus mehreren Versionen auswählen. Normalerweise ist `Eclipse for Java Developers` die richtige Version.

#### UTF-8 Kodierung einstellen
In `Eclipse` geht das unter `Window -> Preferences` bzw. `Eclipse -> Preferences` auf MacOS
und anschließend `General -> Workspace -> Text-file encoding -> Other -> UTF-8`.

Die Änderung wirkts sich aber erst auf neue Dateien aus.

### Was bedeuten die Dateien?
In Java gibt es zwei Arten von Dateien: `.java` und `.class`. Erstere sind Quellcode Dateien,
also die Dateien die ein Programmierer erstellt und verändert. Letztere sind die vom Java
Compiler kompilierten Dateien, welche man mit Java ausführen kann. IDEs wie `Eclipse`
kompilieren `.java`-Dateien automatisch beim speichern im Hintergrund, weshalb man davon
nichts mitbekommt. Meist befinden sich die `.java`-Dateien in dem Ordner `src` (für Sources, eng. für Quellen)
und die kompilierten `.class`-Dateien in dem Ordner `bin` (für Binaries) oder `build`.

### Von Hand kompilieren mit `javac`
Man kann Java-Quellcode natürlich auch "von Hand" kompilieren. Dazu benutzt man
den Java-Compiler `javac`. Um das auszuprobieren erstelle in einem beliebigen Ordner
eine Datei `MeinProgram.java` mit folgendem Inhalt:
{% highlight java %}
public class MeinProgram extends MiniJava {
    public static void main(String[] args) {
        write("Hello World!");
    }
}
{% endhighlight %}

Außerdem muss sich in dem selben Ordner auch die `MiniJava.java` Datei befinden,
welche von [Moodle](https://www.moodle.tum.de/course/view.php?id=35284) heruntergeladen
werden kann.

Öffne nun ein `Terminal` und wechsle in den Ordner in dem die Datei liegt.
Siehe dazu auch [Wie benutze ich das Terminal?](terminal-how-to).

Führe dannach `javac MeinProgram.java` aus. Wenn alles funktioniert befinden sich in
dem selben Ordner jetzt die kompilierten Programme `MeinProgram.class` und `MiniJava.class`.

Das Program kann nun mit `java MeinProgram` ausgeführt werden, worauf sich ein
Fenster mit dem Text `Hello World!` öffnen sollte.

#### Fehler: Befehl "javac" konnte nicht gefunden werden (nur Windows)
Falls du unter Windows einen Fehler mit der Nachricht `Befehl "javac" konnte nicht gefunden werden` erhälst,
musst du Java zum Pfad hinzufügen, damit Windows die Programme findet.

Dazu musst du als erstes die JDK Programme finden. Diese sollten sich normalerweise
in `C:\Program Files\Java\jdk1.X.X_xx\bin` oder `C:\Program Files (x86)\Java\jdk1.X.X_xx\bin`
befinden, wobei sich die Versionsnummern ändern können (`x` steht für eine beliebige Nummer).
Wenn du den Ordner im Explorer gefunden hast, kopiere den Pfad. Dann klicke im Explorer
mit der rechten Maustaste auf `Dieser PC`. Klicke in der linken Spalte auf `Erweiterte Systemeinstellungen`,
dann auf `Umgebungsvariablen`, unter `Systemvariablen` auf `Path` und dann `Bearbeiten`
und füge den vorher kopierten Pfad hinzu.

### Kurze Erklärung eines Java-Programms
Was genau eine Klasse ist und das `extends MiniJava` bedeutet wird später in der
Vorlesung noch genauer erklärt, hier aber mal eine kurze Erklärung,
was der Teil auserhalb von `write("HelloWorld!");` in etwa bedeutet.

`public class MeinProgramm` erstellt eine neue Klasse. Jede Klasse steht in
einer eigenen `.java`-Datei die genauso wie die Klasse heißen muss.

`extends MiniJava` bedeutet das unsere Klasse `MiniJava` erweitert. Das hat
den Effekt, dass wir auf alle Methoden von `MiniJava`, wie beispielsweise
`write()` zugreifen können.

Die Methode `public static void main(String[] args)` ist eine besondere Methode,
die von Java beim Start des Programms aufgerufen wird. Ein Java-Programm besteht
eigentlich nur genau aus dem, was in dieser `main`-Methode steht. Wenn das Ende
der Methode erreicht wurde endet das Programm.

Die geschweiften Klammern `{` und `}` werden in Java benutzt um den Anfang und das Ende von
einzelnen Blöcken, wie der Klasse `MeinProgramm` oder der `main`-Methode zu markieren.
Theoretisch könnte man so auch ein Java-Programm in einer einzigen Zeile schreiben.
