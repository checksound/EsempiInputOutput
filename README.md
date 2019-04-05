# Esempi Input/Output

Esempio [CopyFile](./src/CopyFile.java) programma che compia un file.

Esempio [CopyFileAsResources](./src/CopyFileAsResources.java), simile all'esempio precedente, solo che utilizza la nuova feature del **try-catch-with-resource** per chiudere in automatico gli stream di input e di output.

Programma [PhoneDirectoryFileDemo](./scr/PhoneDirectoryFileDemo.java) rende persistente un elenco telefonico in cui si associa un nome con in numero di telefono dell'utente tramite una `java.util.Map<String, String>`. I dati sono salvati in un file della directory home dell'utente, qunado si esce dal programma, e caricati quando viene lanciato il programma, carindo i dati dal file (se presente), nella directory home, all'interno della `Map<String, String>`. I dati sono così resi persistenti tra le diverse esecuzioni del programma.
 
