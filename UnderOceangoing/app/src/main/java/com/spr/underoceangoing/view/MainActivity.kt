package com.spr.underoceangoing.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.spr.underoceangoing.R
import com.spr.underoceangoing.adapter.CardAdapter
import com.spr.underoceangoing.interfaces.InfoClickListener
import com.spr.underoceangoing.databinding.ActivityMainBinding
import com.spr.underoceangoing.model.ConstantsForInfo.INFO_ID_EXTRA
import com.spr.underoceangoing.model.ConstantsForInfo.infoList
import com.spr.underoceangoing.model.Info

class MainActivity : AppCompatActivity(), InfoClickListener {

    private lateinit var binding: ActivityMainBinding
    private var mInfoList: ArrayList<Info>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        descriptionInfo()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(infoList, mainActivity)
        }
    }

    override fun onClick(info: Info) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(INFO_ID_EXTRA, info.id)
        startActivity(intent)
    }


    private fun descriptionInfo() {
        val info1 = Info(
            R.drawable.img_1,
            "Dermochelys coriacea",
            "КОЖИСТАЯ ЧЕРЕПАХА",
            "Dermochelys coriacea — единственный вид в семействе Dermochelyidae. Это самая внушительная из морских черепах. Он может достигать 400 кг и превышать два метра в длину. Его панцирь покрыт не чешуей, а прочной кожей."
        )
        infoList.add(info1)

        val info2 = Info(
            R.drawable.img_2,
            "Chelonia mydas",
            "ЗЕЛЕНАЯ ЧЕРЕПАХА",
            "Chelonia mydas — самая крупная из хелонид. Его вес колеблется от 160 до 250 кг, а рост — от 80 до 130 см. В ювенильном возрасте зеленая черепаха в основном плотоядна и питается мелкими ракообразными и рыбой. Во взрослом состоянии он становится вегетарианцем и питается в основном морскими растениями. Своим названием она обязана необычному цвету своей плоти, что объясняется ее рационом питания.",
        )
        infoList.add(info2)

        val info3 = Info(
            R.drawable.img_3,
            "Каретта-каретта",
            "МОРСКАЯ ЧЕРЕПАХА ЛОГГЕРХЕД",
            "Каретта-каретта достигает размеров 120 см при весе 200 кг. Плотоядный, он питается медузами, мелкой рыбой, крабами и креветками. Мощная челюстная мышца позволяет ему раздавливать ракообразных, прежде чем проглотить их.",
        )
        infoList.add(info3)

        val info4 = Info(
            R.drawable.img_4,
            "Eretmochelys imbricata",
            "ЯСТРЕБИНАЯ ЧЕРЕПАХА",
            "Eretmochelys imbricata весит от 60 до 90 кг при размере от 60 до 120 см. Всеядный, он питается губками, поэтому его кожа ядовита для человека. Эта особенность позволила ему держаться подальше от браконьеров, заинтересованных в мясе. Однако на него охотятся из-за его красивой чешуи, из которой легко сделать поделки, например, расчески или украшения."
        )
        infoList.add(info4)

        val info5 = Info(
            R.drawable.img_5,
            "Lepidochelys olivacea",
            "ЧЕРЕПАХА ОЛИВКОВОГО РИДЛИ",
            "Lepidochelys olivacea обязана своим названием оливково-зеленому цвету своего карапакса. Его размеры составляют от 50 до 75 см при весе от 40 до 50 кг. Он известен своими массовыми высадками (по-испански их называют «аррибадас») самок, приплывающих откладывать яйца на пляжи тихоокеанского побережья Центральной Америки (Мексика, Коста-Рика, Панама), а также в Южной Америке, на побережье Суринама."
        )
        infoList.add(info5)

        val info6 = Info(
            R.drawable.img_6,
            "Lepidochelys kempii ",
            "ЧЕРЕПАХА РИДЛИ КЕМПА",
            "Lepidochelys kempii — самый редкий и самый незаметный. Он также самый маленький: от 45 до 70 см при весе от 30 до 50 кг. Он расположен в основном на мексиканском пляже Плайя-де-Ранчо-Нуэво.",
        )
        infoList.add(info6)

        val info7 = Info(
            R.drawable.img_7,
            "Natator depressus",
            "ПЛОСКОСПИННАЯ ЧЕРЕПАХА",
            "Natator depressus встречается исключительно в Австралии, Папуа-Новой Гвинее и Индонезии. На сегодняшний день лишь несколько пляжей на севере Австралии, по-видимому, являются местом их размножения. Его название происходит от его особенно плоской раковины. Его размеры составляют от 95 до 130 см при весе от 100 до 150 кг. Рацион, состоящий из морских огурцов, моллюсков и медуз, делает ее плотоядной черепахой"
        )
        infoList.add(info7)

        val info8 = Info(
            R.drawable.img_8,
            "Eretmochelys imbricata",
            "ЧЕРЕПАХА БИССА",
            "Черепаха вида бисса (лат. Eretmochelys imbricata), относящегося к семейству Cheloniidae. Название рода Eretmochelys  происходит от греческих корней eretmo и chelys, что означает «весло» и «черепаха». Передние ласты этой черепахи действительно напоминают весла и успешно выполняют их функции. Латинское название вида imbricata соответствует английскому термину черепитчатые. Ведь задние щитки на панцире черепах перекрываются как черепицы на крыше. Бисса имеет два подвида: атлантический Eretmochelys imbricata imbricate и тихоокеанский Eretmochelys imbricata bissa"
        )
        infoList.add(info8)

        // More Items in Recycler
        infoList.add(info1)
        infoList.add(info2)
        infoList.add(info3)
        infoList.add(info4)
        infoList.add(info5)
        infoList.add(info6)
        infoList.add(info7)
        infoList.add(info8)
    }
}