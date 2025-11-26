# Master-Detail-Ansicht

Das Best-Practice-Beispiel für die Master-Detail-Ansicht von Axon Ivy
demonstriert die folgenden Funktionen:

* Basierend auf der Komplexität des Projekts werden vier verschiedene Ansätze
  zur Implementierung des Master-Detail-Musters vorgestellt. Diese Ansätze
  umfassen die Verwendung verschiedener Prozesselemente, UI-Ansichten und
  modaler Dialoge.
* Dieses Beispiel vereinfacht die Herausforderungen der Benutzeroberfläche
  sowohl für professionelle Entwickler als auch für Low-Code-Entwickler und
  bietet eine Anleitung zur effizienten Implementierung der
  Master-Detail-Schnittstelle.
* Dieses Best-Practice-Beispiel ist eine wertvolle Ressource für die Lösung von
  Anforderungen an die
  [Master-Detail-Schnittstelle](https://en.wikipedia.org/wiki/Master%E2%80%93detail_interface)
  in jedem Prozessautomatisierungsprojekt.

## Demo

In dieser Demo listet eine Lazy-Datentabelle alle Produkte auf, die im
Ivy-Business-Repo verfügbar sind. Es gibt vier Szenarien:

1. Der Benutzer fügt ein neues Produkt hinzu (angezeigt durch ein modales
   Dialogfeld, das innerhalb desselben HTML-Dialogfelds wie das
   Master-Dialogfeld geöffnet wird).
2. Der Benutzer bearbeitet ein vorhandenes Produkt (dargestellt durch ein
   Geschäftsprozessdesign: Der Prozessablauf führt den Benutzer zu einem
   eigenständigen Detail-Dialogfeld, und nach Abschluss der Bearbeitung kehrt
   der Benutzer zum Master-Dialogfeld zurück).
3. Der Benutzer bearbeitet ein bestehendes Produkt (dies wird durch das Starten
   eines Prozesses über einen Link demonstriert: Der Benutzer wird zu einem
   Prozessstart weitergeleitet, der einen eigenständigen Detail-Dialog öffnet.
   Nach Abschluss der Bearbeitung kehrt der Benutzer zum Master-Dialog zurück).
4. Der Benutzer bearbeitet ein vorhandenes Produkt (dargestellt durch eine
   Detailansicht im Master-Dialogfeld und Navigation mit PrimeFaces).

![Bild](https://github.com/axonivy-market/master-detail/assets/129939502/44e36978-dd07-453f-857d-4db359318165)


## Setup

Starten Sie einfach den Testprozess mit dem Namen: `Create Test Data Repo`.
Dieser Prozess generiert einige Produkte innerhalb des Business-Repositorys, um
die Produkttabelle mit Daten zu initialisieren.

Starten Sie dann den Prozess `Produktliste anzeigen`.

