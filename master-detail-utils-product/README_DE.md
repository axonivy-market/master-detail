# Master-Detail-Ansicht

Das Best-Practice-Beispiel der Master-Detail-Ansicht von Axon Ivy zeigt dir folgende Funktionen:

* Vier verschiedene Ansätze zur Implementierung des Master-Detail-Musters werden basierend auf der Komplexität des Projekts demonstriert. Diese Ansätze beinhalten die Nutzung unterschiedlicher Prozesselemente, UI-Ansichten und modaler Dialoge.
* Dieses Beispiel vereinfacht UI-Herausforderungen sowohl für professionelle Entwickler als auch für Low-Coder und bietet Anleitungen zur effizienten Implementierung der Master-Detail-Schnittstelle.
* Dieses Best-Practice-Beispiel ist eine wertvolle Ressource zur Lösung von [Master-Detail-Schnittstellen](https://de.wikipedia.org/wiki/Master-Detail-Schnittstelle)-Anforderungen in jedem Prozessautomatisierungsprojekt.

## Demo

In dieser Demo listet eine Lazy-Datatable alle im Ivy Business-Repository verfügbaren Produkte auf. Es gibt vier Szenarien:

1. Der Benutzer fügt ein neues Produkt hinzu (demonstriert durch einen modalen Dialog, der im selben HTML-Dialog wie die Master-Ansicht geöffnet wird).
2. Der Benutzer bearbeitet ein vorhandenes Produkt (demonstriert durch ein Geschäftsprozessdesign: Der Prozessfluss führt den Benutzer zu einem eigenständigen Detail-Dialog, und nach Abschluss der Bearbeitung kehrt der Benutzer zum Master-Dialog zurück).
3. Der Benutzer bearbeitet ein vorhandenes Produkt (demonstriert durch die Einleitung eines Prozesses über einen Link: Der Benutzer wird zu einem Prozessstart weitergeleitet, der einen eigenständigen Detail-Dialog öffnet. Nach Abschluss der Bearbeitung kehrt der Benutzer zum Master-Dialog zurück).
4. Der Benutzer bearbeitet ein vorhandenes Produkt (demonstriert durch eine Detailansicht, die im Master-Dialog enthalten ist und mit PrimeFaces navigiert wird).

![image](https://github.com/axonivy-market/master-detail/assets/129939502/44e36978-dd07-453f-857d-4db359318165)
