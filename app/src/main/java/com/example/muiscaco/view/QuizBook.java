package com.example.muiscaco.view;

import com.example.muiscaco.R;

public class QuizBook {
    public static String[] questions = new String [] {
            "¿En los actuales departamentos de Cundinamarca, Santander y Boyacá era donde estaban ubicados los muiscas?",
            "¿La sociedad muisca era jerarquizada, o sea, que unas personas tenían más privilegios que otras?",
            "¿Según la organización de los muisca, varias tribus formaban un clan?",
            "¿Las lagunas y los humedales eran sagrados para los muiscas porque ellos reconocían la importancia del agua?",
            "¿Las lagunas eran importantes para los muiscas porque ahí se realizaban las ofrendas a los muertos en combate?",
            "¿La antigua laguna de Guasca es conocida hoy en día como el pantano de Martos?",
            "¿Los muiscas consideraban a los árboles más altos como sitios sagrados?",
            "¿Para los muiscas, Sie era la diosa del agua?",
            "¿Para los muiscas, las ranas eran dioses?",
            "¿La quinua, el maíz y la papa eran los principales productos de la agricultura muisca?",
            "¿Los muiscas eran excelentes en los intercambios comerciales con el oro, el hierro y el acero?",
            "¿Los principales materiales que utilizaban los muiscas para construir sus casas eran la caña y el barro?"
    };

    public static int[] images;

    public static boolean[] answers;

    static {
        images = new int[]{
                R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
                R.drawable.img_5, R.drawable.img_6, R.drawable.img_7, R.drawable.img_8,
                R.drawable.img_9, R.drawable.img_10, R.drawable.img_11, R.drawable.img_12
        };
        answers = new boolean[]{
                true, true, false, true, false, true, false, true, false, true, false, true
        };
    }
}
