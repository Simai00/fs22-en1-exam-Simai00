# Aufgabe 3 (11 Punkte)

## Vorgehen
Schreiben Sie eine Klasse `DataStore`. Die Klasse kann sämtliche Referenztypen speichern, vorausgesetzt der Referenztyp implementiert das `Comparable` Interface.

Die Klasse soll folgende Operationen haben:
- `sort()` sortiert den `DataStore` entsprechend dem `Comparable` und gibt die sortierte Liste der Daten zurück. Die zurückgegebene Liste soll **nicht modifizierbar sein**. Wird auf einem leeren `DataStore` die `sort` Operation aufgerufen, so wird eine `java.lang.IllegalStateException` geworfen.
- `save(...)` speichert ein Element im `DataStore`.
- `size()` gibt die Anzahl der Elemente im `DataStore` zurück. 

Die Methoden und deren Signaturen können Sie aus den Testfällen ableiten.

## Hinweis
Entfernen Sie schrittweise die Zeilenkommentare der Tests. Beginnen Sie mit dem ersten Test, wenn dieser erfolgreich durchläuft, entfernen Sie den Kommentar des zweiten Tests usw. 