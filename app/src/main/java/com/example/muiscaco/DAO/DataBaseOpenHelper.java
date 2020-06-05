package com.example.muiscaco.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.muiscaco.R;

public class DataBaseOpenHelper extends SQLiteOpenHelper {
    public DataBaseOpenHelper(@Nullable Context context) {
        super(context, UtilitiesDataBase.DATABASE_NOMBRE, null, UtilitiesDataBase.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    db.execSQL(UtilitiesDataBase.TablaMito.CREATE_TABLE_MITO);
    db.execSQL(UtilitiesDataBase.TablaDios.CREATE_TABLE_DIOS);
    db.execSQL(UtilitiesDataBase.TablaLaguna.CREATE_TABLE_LAGUNA);

    //Mitos
    insertMito(db,"Mito de Bague", "En el principio sólo existía Bague, la Madre Abuela. Entonces Bague gritó, y aparecieron los dioses, la luz, las plantas, los animales y los muiscas. Luego los dioses llenaron una olla con semillas y piedras, y sembraron luceros en el espacio. Tomaron las migajas que habían quedado en la olla y las lanzaron muy lejos, y ese fue el origen de las estrellas. Sin embargo, todo estaba quieto, nada se movía. Entonces los dioses fueron a visitar a Bague, y le contaron su pesar porque nada se movía, ni crecía, ni sonaba. La Madre Abuela preparó una bebida que los dioses tomaron hasta quedar dormidos, comenzaron a soñar y a tener visiones, y en sus sueños todo se movía, las aves cantaban, las cascadas hacían ruido y los hombres se afanaban, en sus labores cotidianas. Cuando los dioses despertaron, la luz se esparció por el universo, y todo tuvo movimiento, como en sus sueños.",
                R.drawable.mito_bague);
    insertMito(db, "Mito de Chiminigagua", "Cuando ya era de noche, antes de que hubiera nada en el mundo, estaba la luz metida en una cosa grande, llamada Chiminigagua, de donde después salió. Chiminigagua comenzó a salir y a mostrar la luz que en sí tenía. Lo primero que creó fueron unas aves negras y grandes, a las cuales mandó que tuviesen ser y fuesen por todo el mundo echando aliento o aire por los picos. Y el aire que echaban era lúcido y resplandeciente. Y luego que hubieron recorrido el mundo, quedó todo claro e iluminado. Luego creó Chiminigagua todas las otras cosas que hay en el mundo, y entre todas, las más hermosas fueron el Sol y su esposa, la Luna.",
                R.drawable.mito_chiminigagua);

    insertMito(db, "Mito de Bachue", "De la Laguna de Iguaque, poco después de la creación del mundo, salió una mujer llamada Bachué, también conocida como Furachogua, que quiere decir “mujer buena”. Traía consigo a un niño de la mano, de unos tres años de edad, y bajaron juntos desde la sierra hasta la sabana, donde hicieron una casa en la que vivieron hasta que el muchacho tuvo edad de desposar a Bachué. Tuvieron luego muchos hijos, y era Bachué tan fértil, que en cada parto paría de cuatro a seis hijos, de modo que muy pronto se llenó la Tierra de gente. Bachué y su esposo viajaron por muchos lugares, dejando hijos en todas partes, hasta que después de muchos años, estando ya viejos, llamaron a muchos de sus descendientes para que los acompañasen de regreso a la laguna de la que habían salido.",
            R.drawable.mito_bachue);

    insertMito(db, "Mito de Bochica", "Hace mucho tiempo, un hombre desconocido, de piel blanca y ojos azules, con el cabello y la barba larga hasta la cintura, cogida la cabellera con una cinta, con los pies descalzos, y vistiendo una manta o túnica hasta las pantorrillas, atada con un nudo sobre el hombro derecho. Entró por el pueblo de Pasca, y de allí pasó a Bosa, donde se le murió un camello que traía, cuyos huesos conservaron los muiscas. Este hombre, conocido como Bochica, les enseñó a los muiscas a hilar algodón y tejer mantas, pues antes de esto, se cubrían con unas planchas burdas de algodón en rama, atadas con cordezuelas de fique. En Cota duró algunos días enseñando a un gran número de gente de todos los pueblos vecinos. Allí habló desde un promontorio alto, al que le hicieron un foso alrededor de más de dos mil pasos para que la gente no lo atropellase y pudiese hablar libremente. Después prosiguió su viaje hacia el Nordeste, hasta llegar a la provincia de Guane y entró en el valle de Sogamoso, en donde desapareció.",
            R.drawable.mito_bochica);

    insertMito(db,"Mito del Tequendama","Como los muiscas habían perdido el respeto por los dioses, ofendieron a Chibchacum, que antes había sido el más querido de sus dioses. Éste decidió castigarlos inundando la sabana, para lo cual hizo nacer los ríos Sopó y Tivitó, que unieron sus cauces al del Funza. La inundación acabó con muchos cultivos y vidas humanas, hasta que el pueblo clamó con ayunos y sacrificios a Bochica que los librase de aquella calamidad. Finalmente, una tarde, en medio de un gran estruendo, apareció Bochica sobre el arcoíris, con una vara de oro en la mano, la cual arrojó hacia la sierra que trancaba el agua, abriéndose al instante el Salto del Tequendama, que dio paso a las aguas. En castigo por la inundación provocada, Bochica sentenció a Chibchacum a cargar el mundo sobre sus hombros, de modo que cada vez que cambia de hombro para descansar, se produce un temblor de tierra.",R.drawable.mito_del_tequendama);



    //Dioses

    insertDios(db,"Chiminigagua","Dios superior, principio de la luz. No tiene ninguna representación física; de él procede todo lo creado. Difundió la luz por toda la creación valiéndose de dos aves negras que salieron de su mismo ser, que hicieron que la Tierra se viera clara e iluminada.",
            R.drawable.chiminigagua);
    insertDios(db,"Sie"," Diosa del agua. Los Muisca le tenían un gran respeto y amor por ser la protectora de las fuentes, los ríos y las lagunas.",
            R.drawable.sie);
    insertDios(db,"Sue"," El dios Sol. No es la luz, porque la luz reside en Chiminigagua. Los Muisca adoraban al Sol: lo tenían como padre; cada Muisca creía que tenía parte del dios adentro y lo ratificaban con su sombra… por ello creían que siempre los acompañaba durante el día.",
            R.drawable.sue);

    insertDios(db,"Chie","La diosa Luna. Preside la noche. Simboliza el principio que produce las pasiones humanas, los apetitos y los deseos. Para los Muisca, Chie era la pareja del Sol. Ella los cuidaba de noche y los protegía de la oscuridad y Sue los protegía de día",
            R.drawable.chie);
    insertDios(db,"Huitaca","Hija de la diosa Chie, aunque también es identificada como otro aspecto de la misma Chie. Arrastraba a los hombres a la corrupción y el pecado. Castigada por Bochica, quien la transformó en lechuza, para que nunca pudiera ver el sol.",
            R.drawable.huitaca);
    insertDios(db,"Chibchacon","Controla las lluvias, hace que los ríos se salgan de su cauce y produce los temblores de tierra, luego de que Bochica lo condenara a cargar el mundo sobre sus hombros.",
            R.drawable.chibchacon);
    insertDios(db,"Cuchavira","Es el dios del arcoíris y de la medicina, mediador entre dioses y hombres. A él lo invocaban los enfermos de fiebre y las mujeres cuando entraban en labores de parto.",
            R.drawable.cuchavira);
    insertDios(db,"Nencatacoa","Dios de la embriaguez, la irreverencia, la música y la danza. Transforma las cosas con otras apariencias. Preside las borracheras, protege a los tejedores y estampadores de telas. Suele manifestarse a veces en forma de zorro.",
            R.drawable.nencatacoa);
    insertDios(db,"Bachue","Madre del género humano. Representa el principio germinador femenino de la naturaleza. Preside el crecimiento de las plantas, las sementeras y las legumbres. Bachué enseño preceptos como la paz y la convivencia a los primeros pobladores, les enseñó a cazar, cultivar, respetar las leyes y adorar a los dioses.",
            R.drawable.bachue);






    //Laguna

        insertLaguna(db,"Laguna de Guatavita - Sesquilé, Cundinamarca","Una de las lagunas más importantes para los Muiscas, además de ser parte de la red de 5 lagunas donde los indígenas iban a orar, ofrendar y hacer rituales en agradecimiento o petición a sus deidades. En esta laguna se da origen a la Leyenda de El Dorado, en la que se cuenta cómo un nuevo cacique entraba en una balsa cubierto de polvo de oro, esperando el reflejo del sol sobre su cuerpo. Se dice que los habitantes tiraban al agua esmeraldas y oro, para darle la bienvenida al nuevo cacique."
                ,R.drawable.laguna_de_guatavita);
        insertLaguna(db,"Laguna de Guasca - Entre Guasca y Guatavita, Cundinamarca","A diferencia de las otras lagunas que componen la red de lugares sagrados para los Muiscas, esta fuente ya no existe, o al menos no como se conocía. Ahora es un pantano con cortos y pocos cuerpos de agua, resultado de la intervención del holandés Gonzalo Linus Martos, quien explota minas, al enterarse de los posibles tesoros que los indígenas arrojaban al agua, decide secar la laguna para buscar oro. A partir de ese momento el terreno quedó convertido en un pantano que a pesar de todo sobrevivió y sigue siendo un espacio rico en fauna y flora."+
                "Por otro lado, además de perder su agua, también perdió su nombre. Quienes visiten este lugar se encontrarán con el Pantano de Martos.",
                R.drawable.laguna_de_guasca_pantano_de_martos);
        insertLaguna(db,"Laguna de Siecha - Guasca, Cundinamarca","Tres cuerpos de agua de origen glaciar eran testigos y puntos del recorrido sagrado que realizaban los Muiscas. En estas lagunas rendían culto a la fertilidad y la vida, ya que dichos temas estaban relacionados con el agua, como fuente creadora y dadora de vida. Se cree que la leyenda original de El Dorado, ocurrió en Siecha y no en Guatavita, igual hasta el momento nadie ha podido encontrar el gran tesoro que esconden estas aguas.",
                R.drawable.laguna_de_siecha);

        insertLaguna(db,"Laguna de Teusaca - Vía Choachí, Cundinamarca","Actualmente se conoce como El Verjón, ubicada dentro del Parque Ecológico Matarredonda, allí los indígenas hacían sus ofrendas a la madre tierra, siempre dando las gracias a cada elemento de la naturaleza, en especial el agua, quien para ellos es su fuente de origen y sustento. Desde allí se puede ver Bogotá, enmarcada por Monserrate y Guadalupe.",
                R.drawable.laguna_de_teusaca);
        insertLaguna(db,"Laguna de Ubaque - Entre Choachí y Ubaque, Cundinamarca","El último paradero de la ruta sagrada de los Muiscas. Allí ellos completaban su recorrido en el que pasaban por las lagunas mencionadas, en las cuales se hacían cantos, rituales y ofrendas. Actualmente sirve para descanso y vivienda de muchos, convirtiendo a la laguna de Ubaque en un espacio para acampar.",
                R.drawable.laguna_de_ubaque);


    }


    private void insertMito(SQLiteDatabase db, String title, String description, int image){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaMito.TITLE,title);
        registro.put(UtilitiesDataBase.TablaMito.DESCRIPTION,description);
        registro.put(UtilitiesDataBase.TablaMito.IMAGE,image);

        db.insert(UtilitiesDataBase.TablaMito.TABLE_NAME, null, registro);

    }

    private void insertDios(SQLiteDatabase db, String title, String description, int image){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaDios.TITLE,title);
        registro.put(UtilitiesDataBase.TablaDios.DESCRIPTION,description);
        registro.put(UtilitiesDataBase.TablaMito.IMAGE,image);
        db.insert(UtilitiesDataBase.TablaDios.TABLE_NAMED, null, registro);

    }
    private void insertLaguna(SQLiteDatabase db, String title, String description, int image){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaLaguna.TITLE,title);
        registro.put(UtilitiesDataBase.TablaLaguna.DESCRIPTION,description);
        registro.put(UtilitiesDataBase.TablaMito.IMAGE,image);
        db.insert(UtilitiesDataBase.TablaLaguna.TABLE_NAMEL, null, registro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
