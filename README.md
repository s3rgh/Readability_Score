# Work on project. Stage 3/4: Score!

## Description

In this stage, you will program the Automated readability index. It was introduced in 1968 and a lot of research works rely on this. The index is calculated by the following formula:

![img.png](img.png)

You can look at different ages corresponding to the different scores by the table in this article (https://en.wikipedia.org/wiki/Automated_readability_index).
Also, your program should read a file instead of typing a text manually. You should pass the filename through the command line arguments.
The program should output the score itself and an approximate age needed to comprehend the text.
Use the appropriate rounding function to calculate the score as integer. You should also print how many characters, words, and sentences the text has. 
The number of characters is any visible symbol (so, in the real text it's everything except space, newline and tab).

Notice, that the text can contain multiple lines, not just a single line like in the previous stages. You should analyze all the lines.

## Examples

The symbol > represents the user input. Note that it's not part of the input.

 - Example 1 
   

    java Main in.txt
    The text is: Readability is the ease with which a reader can understand a written text. In natural language, the readability of text depends on its content and its presentation. Researchers have used various factors to measure readability. Readability is more than simply legibility, which is a measure of how easily a reader can distinguish individual letters or characters from each other. Higher readability eases reading effort and speed for any reader, but it is especially important for those who do not have high reading comprehension. In readers with poor reading comprehension, raising the readability level of a text from mediocre to good can make the difference between success and failure

    Words: 108
    Sentences: 6
    Characters: 580
    The score is: 12.86
    This text should be understood by 18-24 year olds.

 - Example 2


    java Main in.txt 
    The text is: This is the page of the Simple English Wikipedia. A place where people work together to write encyclopedias in different languages. That includes children and adults who are learning English. There are 142,262 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons License 3 and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. You may ask questions at Simple talk.

    Words: 100
    Sentences: 10
    Characters: 476
    The score is: 5.98
    This text should be understood by 11-12 year olds. 