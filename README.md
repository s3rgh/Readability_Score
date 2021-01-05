Work on project. Stage 1/4: Simplest estimation

- Description

Ever wonder how to measure if the text is hard or easy to read? For a human this task is pretty simple: you just read the text and feel if you're struggling or not. But how to teach a computer do that? In this project, you will write such a program.

Firstly, let's create a simple program. If the text contains more than 100 symbols (including spacebars and punctuation) then the text is considered hard to read. Else, the text is considered easy to read. If the text contains exactly 100 symbols then it is still easy to read.

The input contains a single line with text. Output "HARD" if the text is hard to read and "EASY" if the text is easy to read.


 - Examples

The symbol > represents the user input. Note that it's not part of the input.

Example 1

    > This text is simple to read!

    EASY

Example 2

    > This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence.

    HARD