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
    db.execSQL(UtilitiesDataBase.TablaCostumbre.CREATE_TABLE_COSTUMBRE);

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
        insertLaguna(db,"Laguna de Guasca - Guasca, Cundinamarca","A diferencia de las otras lagunas que componen la red de lugares sagrados para los Muiscas, esta fuente ya no existe, o al menos no como se conocía. Ahora es un pantano con cortos y pocos cuerpos de agua, resultado de la intervención del holandés Gonzalo Linus Martos, quien explota minas, al enterarse de los posibles tesoros que los indígenas arrojaban al agua, decide secar la laguna para buscar oro. A partir de ese momento el terreno quedó convertido en un pantano que a pesar de todo sobrevivió y sigue siendo un espacio rico en fauna y flora."+
                "Por otro lado, además de perder su agua, también perdió su nombre. Quienes visiten este lugar se encontrarán con el Pantano de Martos.",
                R.drawable.laguna_de_guasca_pantano_de_martos);
        insertLaguna(db,"Laguna de Siecha - Guasca, Cundinamarca","Tres cuerpos de agua de origen glaciar eran testigos y puntos del recorrido sagrado que realizaban los Muiscas. En estas lagunas rendían culto a la fertilidad y la vida, ya que dichos temas estaban relacionados con el agua, como fuente creadora y dadora de vida. Se cree que la leyenda original de El Dorado, ocurrió en Siecha y no en Guatavita, igual hasta el momento nadie ha podido encontrar el gran tesoro que esconden estas aguas.",
                R.drawable.laguna_de_siecha);

        insertLaguna(db,"Laguna de Teusaca - Vía Choachí, Cundinamarca","Actualmente se conoce como El Verjón, ubicada dentro del Parque Ecológico Matarredonda, allí los indígenas hacían sus ofrendas a la madre tierra, siempre dando las gracias a cada elemento de la naturaleza, en especial el agua, quien para ellos es su fuente de origen y sustento. Desde allí se puede ver Bogotá, enmarcada por Monserrate y Guadalupe.",
                R.drawable.laguna_de_teusaca);
        insertLaguna(db,"Laguna de Ubaque -Ubaque Cundinamarca","El último paradero de la ruta sagrada de los Muiscas. Allí ellos completaban su recorrido en el que pasaban por las lagunas mencionadas, en las cuales se hacían cantos, rituales y ofrendas. Actualmente sirve para descanso y vivienda de muchos, convirtiendo a la laguna de Ubaque en un espacio para acampar.",
                R.drawable.laguna_de_ubaque);


        //Costumbres


        insertCostumbre(db,"Agricultura","Los muiscas establecieron parcelas de cultivo dispersas en diferentes zonas climáticas. En cada zona tenían viviendas transitorias, lo que les permitía aprovechar los productos agrícolas de las zonas frías y templadas en períodos de tiempo regulados. Este sistema de agricultura, denominado \"modelo de microverticalidad\", era administrado de forma directa o mediante relaciones de tributo e intercambio con otras etnias indígenas a las que los muiscas habían sometido. Este modelo sería una respuesta adaptativa a los limitantes ecológicos, puesto que la mayor parte de las cosechas eran anuales. Además, el riesgo constante de las granizadas y de las heladas, a pesar de no implicar la pérdida total de las cosechas, sí podía generar situaciones de desabastecimiento. Parte del problema se solucionaba con las múltiples variedades de papa que existían, además de que la mayor parte de estas variedades podía resistir las heladas luego de los cinco meses de haber sido sembradas. Pero además, al disponer de productos de diversos pisos térmicos, tenían pleno acceso a la batata, la yuca, el frijol, el ají, la coca, el algodón, la ahuyama, la arracacha, el fique, la quinua y el hayo colorado, aunque el producto básico en su dieta era el maíz.",
                R.drawable.agricultura);
        insertCostumbre(db,"Alimentación","Como los muiscas no conocían el hierro, labraban la tierra con instrumentos de piedra o de madera en tiempo de lluvias, cuando se ablandaba el suelo, y por eso consideraban las temporadas de sequía como una gran calamidad. La papa, el maíz y la quinua eran los principales productos de consumo, los cuales sazonaban con sal, ají y una gran diversidad de hierbas aromáticas. Dos veces al año cosechaban la papa, y el maíz una vez en las tierras frías, en donde estaba asentada la mayor parte de la población. La bebida por excelencia de los muiscas era la chicha, una bebida alcohólica fermentada de maíz. Ejercían la caza y la pesca, esta última en los ríos y lagunas de las planicies con pequeñas redes y balsas de junco que siguieron fabricando hasta el siglo XIX. Consumían también abundantes proteínas vegetales como maní, frijoles y coca, y proteína animal como curí, venado, conejo, pescado, hormigas, orugas, aves y animales de monte.",
                R.drawable.alimentacion);
        insertCostumbre(db,"Vestimenta","Los muiscas fueron hábiles tejedores de algodón. Los güechas (guerreros muiscas) llevaban en la cabeza cascos de oro, mientras que los hombres del común se cubrían la cabeza con gorros de algodón, y en ocasiones especiales con pieles de osos y tigrillos adornados con plumas de todos los colores. Los hombres que pertenecían a la familia del Zipa llevaban sobre la frente medialunas de oro o de plata, con las puntas hacia arriba. Alrededor de los brazos, solían llevar brazaletes con esmeraldas incrustadas, y la gente del pueblo llevaba manillas con huesos de animales. La nobleza llevaba narigueras y orejeras de oro, y todos se pintaban el rostro y el cuerpo con tintes naturales. Las mujeres usaban una manta larga que ceñían a la cintura con una faja, y sobre los hombros otra manta pequeña, sujeta al escote con un alfiler grande de oro o de plata, que tenía un cascabel en uno de sus extremos, de suerte que los pechos quedaban casi descubiertos.",
                R.drawable.vestimenta);
        insertCostumbre(db,"Arquitectura","Los muiscas construían sus casas utilizando como principal material la caña y el barro para hacer las tapias llamadas bahareque. Las casas comunes eran de dos formas: unas cónicas y otras rectangulares. Las primeras consistían en una pared en círculo hecho de palos enterrados como pilares más fuertes sobre los cuales se sostenía de lado y lado un doble entretejido de cañas cuyo intersticio era tupido de barro. El techo era cónico y cubierto de pajas aseguradas sobre varas. Las construcciones rectangulares consistían en paredes paralelas también de bahareque, como las anteriores, con techo en dos alas de forma rectangular. Tanto las construcciones cónicas como las rectangulares tenían puertas y ventanas pequeñas. Al interior el mobiliario era sencillo y consistía principalmente en camas hechas también de cañas, llamadas barbacoas, sobre las cuales se tendía una gran profusión de mantas; las sillas, aunque las tenían, eran escasas, pues los muiscas preferían descansar en cuclillas o de rodillas sobre el suelo.",
                R.drawable.arquitectura);
        insertCostumbre(db,"Actividad económica","En la época precolombina, la actividad económica es principalmente la agricultura, cultivaban maíz, papa, quinua y algodón, entre otros productos agrícolas. Eran excelentes orfebres, practicaban el trueque de mantas, sal, esmeraldas y otros productos con los pueblos vecinos (muzos, panches, sutagaos, guayupes, tecuas, achaguas, tunebos y lanches). Por otra parte la confederación muisca también explotaba los siguientes productos minerales:\n" +
                "\n" +
                "Oro (nyia):\u200B El oro era importado y llegó a ser tan abundante que fue el principal material para la artesanía muisca común (orfebrería). El uso de este metal dentro del territorio de la confederación muisca, unido a la tradición de la coronación del Zipa en la Laguna de Guatavita, contribuirían para la creación del mito de El Dorado.\n" +
                "\n" +
                "Esmeraldas (chuecuta):\u200B Aún hoy Colombia es el primer productor mundial de esmeraldas, que son tenidas entre las más preciadas del planeta. Los principales yacimientos de estas piedras preciosas se encuentran en el departamento de Boyacá, y especialmente en el municipio de Muzo. Junto con el oro, las esmeraldas eran ofrendadas a los dioses en las lagunas sagradas.\n" +
                "\n" +
                "Cobre (bahazca nyia): En los combates y en las fiestas los muiscas usaban máscaras de cobre muy bien elaboradas, y en el intercambio comercial con otros pueblos también usaban pequeños \"tejuelos\" de cobre.\n",
                R.drawable.economia_y_mineria);

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
    private void insertCostumbre(SQLiteDatabase db, String title, String description, int image){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaCostumbre.TITLE,title);
        registro.put(UtilitiesDataBase.TablaCostumbre.DESCRIPTION,description);
        registro.put(UtilitiesDataBase.TablaCostumbre.IMAGE,image);
        db.insert(UtilitiesDataBase.TablaCostumbre.TABLE_NAMEC, null, registro);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
