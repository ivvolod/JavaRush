package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

//    static ImageTypes imageTypes;
//    private static Object reader;

    public static ImageReader getImageReader(ImageTypes types) throws IllegalArgumentException {
        try {
            switch (types){
                case BMP :
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
                default:
                    throw new IllegalArgumentException("Неизвестный тип картинки");
            }


        }catch (NullPointerException e){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
