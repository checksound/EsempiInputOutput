# Esempi Input/Output

Esempio [CopyFile](./src/CopyFile.java) programma che compia un file: utilizza `FileInputStream` e `FileOutputStream` come stream di input e di output, rispettivamente.

Esempio [CopyFileAsResources](./src/CopyFileAsResources.java), simile all'esempio precedente, solo che utilizza la nuova feature del **try-catch-with-resource** per chiudere in automatico gli stream di input e di output.

Esempio di utilizzo `java.io.RandomAccessFile`, [RandomAccessFileTest.java](./src/RandomAccessFileTest.java)

Esempio su serializzazione: [ObjectSerialization.java](./src/ObjectSerializationTest.java)

Esempio **compressione di file e directory**: [Compress.java](./src/Compress.java) e [AppCompress.java](./src/AppCompress.java). Utilizzo: `java AppCompress <from> [<to>]`

Esempio **filtraggio di Character Stream**: [RemoveHTMLReader.java](./src/RemoveHTMLReader.java) e [AppRemoveHTMLReader.java](./src/AppRemoveHTMLReader.java), per rimuovere i tag HTML. Utilizzo: `java AppRemoveHTMLReader <filename>`

Esempio **filtraggio linee di testo**: [GrepReader.java](./src/GrepReader.java) e [AppGrepReader.java](./src/AppGrepReader.java), per restituire le linee contenenti una stringa. Utilizzo: `java AppGrepReader <pattern> <file>`

Programma [PhoneDirectoryFileDemo](./src/PhoneDirectoryFileDemo.java) rende persistente un elenco telefonico in cui si associa un nome con in numero di telefono dell'utente tramite una `java.util.Map<String, String>`. I dati sono salvati in un file nascosto, `.phone_book_demo` della directory home dell'utente, quando si esce dal programma, e caricati quando viene lanciato il programma, carindo i dati dallo stesso file (se presente), all'interno della `Map<String, String>`. I dati sono così resi persistenti tra le diverse esecuzioni del programma.
 
