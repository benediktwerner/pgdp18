---
layout: page
title: Autoformattierung in eclipse
link_title: Autoformatierung
---
Für die späteren Hausaufgaben werdet ihr recht viel Code schreiben müssen.
Damit es trotzdem halbwegs lesbar bleibt verwendet man beim Programmieren meistens sogenannte *Style Guides*
die bestimmte Regeln für die Formatierung des Codes vorgeben.

Im PGdP sollt ihr ungefähr dem [Google Style Guide](https://google.github.io/styleguide/javaguide.html){:target="_blank"}
folgen.

Man kann eclipse aber auch einfach so konfigurieren, dass es euren Code automatisch richtig formatiert.

### Autoformatierung einrichten
1. Lade die Datei [eclipse-java-google-style.xml](https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml)
herunter (`Rechtsklick -> Link speichern unter`). Die Datei und Äquivalente für andere IDEs können auch im
[Github Repository des Google Style Guides](https://github.com/google/styleguide){:target="_blank"}
gefunden werden.
2. Klicke in eclipse unter `Window -> Preferences` auf `Java -> Code Style -> Formatter`,
dort auf `Import` und importiere die gerade heruntergeladene Datei.
3. Fertig.

### Code autoformatieren
Um deinen Code jetzt automatisch zu formatieren benutze `Source -> Format` oder den
dazugehörigen Keyboard-Shortcut <kbd>Strg</kbd>+<kbd><i class="fa fa-arrow-up"></i>Shift</kbd>+<kbd>F</kbd>.
