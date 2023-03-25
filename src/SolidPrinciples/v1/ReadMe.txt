Problem in the v0 is solved by creating an abstract Bird class and Multiple Bird types as a sub types.

But this design still creates problem.
    1. If some bird can't fly, this design will fail. Inside a fly method / In client class condition needs to be checked.
    2. If we create a property canFly and checking for every sub type violates LSP.
    3. We can create a class seperately for flying birds and non - flying birds. But in future there can further classifications. Which will
        lead to create 2^N classes.