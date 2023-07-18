# FirstUniqueLetterInAText

The program accepts an arbitrary text as input and finds in each word of this text the very first symbol that is NOT repeated in the analyzed word.
After that from the received set of symbols the program must select the first unique one (that is, the one that is no longer found in the set) and return it.

For example, if the program receives the text below:

The Tao gave birth to machine language. Machine language gave birth
to the assembler.
The assembler gave birth to the compiler. Now there are ten thousand
languages.
Each language has its purpose, however humble. Each language
expresses the Yin and Yang of software. Each language has its place within
the Tao.
But do not program in COBOL if you can avoid it.
         -- Geoffrey James, "The Tao of Programming"

then it should return the character "m".
