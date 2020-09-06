package GS222MH_assign3.EX7;

import GS222MH_assign3.EX7.NorseGods;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;


public class NorseGodsMain extends Application {
    public static void main(String[] args) {

        Application.launch(args);
    }

    public void start(Stage primaryStage) {

        //Those info are from WikiPedia or https://mythology.wikia.org/wiki/Baldr.
        NorseGods Odin = new NorseGods("Odin", "Aesir", "is a widely revered god in Germanic mythology. Norse mythology, the source of most surviving information about him, associates Odin with wisdom, healing, death, royalty, the gallows, knowledge, war, battle, victory, sorcery, poetry, frenzy, and the runic alphabet, and portrays him as the husband of the goddess Frigg. In wider Germanic mythology and paganism, the god was known in Old English as Wōden, in Old Saxon as Wōdan, in Old Dutch as Wuodan and in Old High German as Wuotan.\n" +
                "\n" +
                "Odin appears as a prominent god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania (from c.  12 BCE) through the tribal expansions of the Migration Period (4th to 6th centuries CE) and the Viking Age (8th to 11th centuries CE). In the modern period the rural folklore of Germanic Europe continued to acknowledge Odin. References to him appear in place names throughout regions historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears his name in many Germanic languages, including in English.\n" +
                "\n" +
                "In Old English texts, Odin holds a particular place as a euhemerized ancestral figure among royalty, and he is frequently referred to as a founding figure among various other Germanic peoples, such as the Langobards. Forms of his name appear frequently throughout the Germanic record, though narratives regarding Odin are mainly found in Old Norse works recorded in Iceland, primarily around the 13th century. These texts make up the bulk of modern understanding of Norse mythology. ");
        NorseGods Thor = new NorseGods("Thor", "Test", "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.\n" +
                "\n" +
                "Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn Járnsaxa, and is generally described as fierce eyed, red haired and red bearded. With Sif, Thor fathered the goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—are recorded throughout sources for Norse mythology. ");

        NorseGods Loki = new NorseGods("Loki", "Frost Giant", "Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also refers to Odin as the father of Váli twice, and Váli is found mentioned as a Son of Loki only once.\n" +
                "\n" +
                "Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents he appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of the god Baldr and Loki is eventually bound by Váli with the entrails of one of his sons. In both the Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter the god Heimdallr and the two will slay each other.\n" +
                "\n" +
                "Loki is referred to in the Poetic Edda, compiled in the 13th century from earlier traditional sources; the Prose Edda and Heimskringla, written in the 13th century by Snorri Sturluson; the Norwegian Rune Poems, in the poetry of skalds, and in Scandinavian folklore. Loki may be depicted on the Snaptun Stone, the Kirkby Stephen Stone, and the Gosforth Cross. Loki's origins and role in Norse mythology, which some scholars have described as that of a trickster god, have been much debated by scholars. Loki has been depicted in or is referenced in a variety of media in modern popular culture. ");

        NorseGods Baldr = new NorseGods("Baldr", "Aesir", "Baldr (also Balder, Baldur) is the god of light, joy, purity, and the summer sun in Norse mythology, and a son of the god Odin and the goddess Frigg. He is the father of Forseti, and he has numerous brothers, such as Thor and Váli.\n" +
                "\n" +
                "In the 12th century, Danish accounts by Saxo Grammaticus and other Danish Latin chroniclers recorded a euhemerized account of his story. Compiled in Iceland in the 13th century, but based on much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous references to the death of Baldr as both a great tragedy to the Æsir and a harbinger of Ragnarök. In addition to being loved by all gods and more physical beings, he was so handsome, generous, and good that he gave off light simply by the purity of his character.\n" +
                "\n" +
                "According to Gylfaginning, a book of Snorri Sturluson's Prose Edda, Baldr's wife is Nanna and their son is Forseti. In Gylfaginning, Snorri relates that Baldr had the greatest ship ever built, Hringhorni, and that there is no place more beautiful than his hall, Breidablik. ");

        //Create a windows with a special size (640 * 480)
        Group root = new Group();
        Scene scene = new Scene(root, 640, 480);

        //Create a list to left of the window (set the pos by hand)
        //I get help with this code from the Graphical User Interfaces lecture.
        ListView<String> godList = new ListView<>();
        godList.setMaxWidth(150);
        godList.prefHeightProperty().bind(scene.heightProperty().subtract(15));
        godList.prefWidthProperty().bind(scene.heightProperty().subtract(10));
        godList.getItems().addAll(
                "Odin",
                "Thor",
                "Loki",
                "Baldr",
                "Freyr",
                "Freyja",
                "Heimdallr",
                "Bragi",
                "Tyr"
        );

        //Write a big text and set the pos.
        final Text theText = new Text(40, 40, "Norse Gods and other Beings");
        theText.setStyle("-fx-font: 25 arial;");
        theText.setX(210);
        theText.setY(30);

        //Create scrollPane and put the text in the scrollPane
        //set the pos and size for scrollPane
        ScrollPane scrollPane = new ScrollPane();
        Text text = new Text();
        scrollPane.setLayoutX(170);
        scrollPane.setLayoutY(40);
        scrollPane.setContent(text);
        scrollPane.prefViewportWidthProperty().bind(scene.widthProperty().subtract(200));
        scrollPane.prefViewportHeightProperty().bind(scene.heightProperty().subtract(70));

        //Array list and add all text
        final ArrayList<String> allText = new ArrayList<>();
        allText.add(Odin.getName() + "\n" + Odin.getRace() + "\n \n" + Odin.getDesc());
        allText.add(Thor.getName() + "\n" + Thor.getRace() + "\n \n" + Thor.getDesc());
        allText.add(Loki.getName() + "\n" + Loki.getRace() + "\n \n" + Loki.getDesc());
        allText.add(Baldr.getName() + "\n" + Baldr.getRace() + "\n \n" + Baldr.getDesc());

        //add all things to the window
        root.getChildren().addAll(godList, theText, text, scrollPane);

        //Add a listener to a selection from the lecture
        godList.getSelectionModel().selectedIndexProperty().addListener(ov -> {
            text.setText(allText.get(godList.getSelectionModel().getSelectedIndex()));
        });

        primaryStage.setTitle("NorseGods");
        primaryStage.setScene(scene);

        //https://stackoverflow.com/questions/29315469/javafx-resize-text-with-window/29316072#29316072
        text.wrappingWidthProperty().bind(scene.widthProperty().subtract(200));
        primaryStage.show();
    }
}
