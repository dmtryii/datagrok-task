package com.dmtryii;

/*
    Is it possible to develop an archiver that would compress every possible file bigger than
    1GB by at least one byte? Provide your reasoning.
 */

public class Archiver {
    /*
        Creating a compression method that consistently reduces the size of files larger than 1GB
        by at least one byte for each file is not possible because of how information theory works.

        Imagine you have a set of unique files, each with a specific size. When you try to compress these files,
        you'll end up with a limited number of possible compressed versions.
        This means that some original files will have to share the same compressed format,
        which can cause problems when trying to decompress them later.

        Moreover, compression works by finding patterns or repeating sequences in data to make it smaller.
        But if a file is already very random and doesn't have any noticeable patterns,
        there's not much that can be done to make it smaller.
        In these cases, the compressed file might end up being the same size as the original
        because all the original data is needed to recreate the randomness.

        In simple terms, while compression can make most files smaller,
        it can't make every file smaller, especially if the file is already packed with information.
     */
}
