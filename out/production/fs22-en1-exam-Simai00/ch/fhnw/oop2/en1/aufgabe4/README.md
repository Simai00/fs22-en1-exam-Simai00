# Aufgabe 4 (9 Punkte)

## Vorgehen
Schreiben Sie die Klasse `JobScheduler` und die Klasse `Job`. Die Klasse `JobScheduler` muss zwingend intern die Klasse `java.util.PriorityQueue` verwenden um die Jobs zu verwalten. Jobs haben eine Priorität `int` und eine Beschreibung `String`. Die Priorität ist eine natürliche Zahl, also ein Integer grösser gleich Null. Je kleiner diese Zahl ist, desto grösser ist die Priorität des jeweiligen Jobs.

Verwenden Sie die Methoden `add` und `remove` der `PriorityQueue`:


<img src='../../../../../../images/aufgabe1.png' width='800'>


Die Methoden und deren Signaturen können Sie aus den Testfällen ableiten.

## Hinweis
Entfernen Sie schrittweise die Zeilenkommentare der Tests. Beginnen Sie mit dem ersten Test, wenn dieser erfolgreich durchläuft, entfernen Sie den Kommentar des zweiten Tests usw. 