package administration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class StructureDetailViewModel : ViewModel() {

    private val _administrationList = MutableLiveData<PersistentList<StructureModel>>().apply {
        value = persistentListOf(
            StructureModel("", "RƏHBƏRLİK", ""),
            StructureModel("İcra hakimiyyətinin başçısı", "Usubov Elxan Zabir", "244-33-23"),
            StructureModel("Başçının birinci müavini", "Həsənov Həsən Yusub", "244-82-81"),

            StructureModel(
                "Başçının müavini – Şəhər təsərrüfatı şöbəsinin müdiri", "--", "244-37-24"
            ),

            StructureModel(
                "Başçının müavini – Sosial-iqtisadi inkişafın təhlili və proqnozlaşdırılması şöbəsinin müdiri",
                "Əliyev Firon Bəxtiyar",
                "244-00-46"
            ),

            StructureModel(
                "Başçının müavini – İctimai-siyasi və hümanitar məsələlər şöbəsinin müdiri",
                "Cavadova Zərinə Əliəkbər",
                "244-00-62"
            ),
            StructureModel("Sektor müdiri – baş mühasib", "Abbasov Qalib Nizami", "244-37-22"),
            StructureModel("Başçının köməkçisi", "Vəliyev Ziya Nazim", "244-33-23"),

            StructureModel(
                "Böyük məsləhətçi – Yetkinlik yaşına çatmayanların işləri və hüquqlarının müdafiəsi üzrə komissiyanın məsul katibi",
                "Səlimov Mayis Davud",
                "244-37-05"
            ),

            StructureModel(
                "Aparıcı məsləhətçi - Yetkinlik yaşına çatmayanların işləri və hüquqlarının müdafiəsi üzrə komissiyanın uşaqlarla iş üzrə - məsləhətçi psixoloqu",
                " Bəkirova Xəyalə Mehman",
                "244-37-05"
            ),

            StructureModel(
                "Aparıcı məsləhətçi - Yetkinlik yaşına çatmayanların işləri və hüquqlarının müdafiəsi üzrə komissiyanın uşaqlarla iş üzrə - məsləhətçi psixoloqu",
                " Bəkirova Xəyalə Mehman",
                "244-37-05"
            ),
            StructureModel("Baş mütəxəssis", "Allahverdiyev Mehman Məmmədemin", "--"),
            //İnformasiya təminatı və təhlil sektoru
            StructureModel("", "İNFORMASİYA TƏMİNATI və TƏHLİLİ SEKTORU", ""),
            StructureModel("Sektor müdiri", "Məhərrəmli Azər İbadullah", "244-03-17"),
            StructureModel("Aparıcı məsləhətçi", "Əliəkbərov Valeh Ziyad", "244-20-50"),
            //Ərazi idarəetmə və yerli özünüidarəetmə orqanları ilə iş şöbəsi

            StructureModel(
                "", "ƏRAZİ İDARƏETMƏ və YERLİ ÖZÜNÜİDARƏETMƏ ORQANLARI ilə İŞ ŞÖBƏSİ", ""
            ),
            StructureModel("Şöbə müdiri", "Mənəfov Rəfail Cəfər", "244-37-75"),
            StructureModel("Baş məsləhətçi", "İsmayılov Tərlan Əbdürəhim", "244-26-54"),
            StructureModel("Böyük məsləhətçi", "İlyasov Səbuhi Bəlqiyas", "244-25-10"),
            //Hüquq şöbəsi
            StructureModel("", "HÜQUQ ŞÖBƏSİ", ""),
            StructureModel("Şöbə müdiri", "Bəşirov Əhmədiyə İdris", "244-32-27"),
            StructureModel("Məsləhətçi", "İranpur İlahə Fikirət", "244-29-80"),
            StructureModel("Məsləhətçi", "Hacı-ağayev Ramil Şirəli", "244-29-80"),
            //İctimai-siyasi və hümanitar məsələlər şöbəsi
            StructureModel("", "İCTİMAİ-SİYASİ və HUMANİTAR MƏSƏLƏLƏR ŞÖBƏSİ", ""),

            StructureModel(
                "Şöbə müdirinin müavini - dini qurumlarla işin təşkilatçısı",
                "Yusifov Sadiq Nütfəli",
                "244-25-44"
            ),
            StructureModel("Baş məsləhətçi", "Əzimova Günəş Qurtuluş", "244-25-94"),
            StructureModel("Baş məsləhətçi", "Hüseynov Nihat Rəcəb", "244-08-79"),
            StructureModel("Baş məsləhətçi", "Salamov Təbriz Əsabəli", "244-25-94"),
            //Sosial-iqtisadi inkişafın təhlili və proqnozlaşdırılması şöbəsi

            StructureModel(
                "", "SOSİAL-İQTİSADİ İNKİŞAFIN TƏHLİLİ və PROQNOZLAŞDIRILMASI ŞÖBƏSİ", ""
            ),
            StructureModel("Şöbə müdirinin müavini", "Xəlilov Xəlil Məhəmməd", "244-31-68"),
            StructureModel("Baş məsləhətçi", "Məmmədov Ramil Kazım", "244-26-26"),
            StructureModel("Baş məsləhətçi", "Məmmədov Rafiq Piri", "244-23-75"),
            StructureModel("Baş məsləhətçi", "Rəcəbov Nazim Kazım", "244-23-75"),
            StructureModel("Aparıcı məsləhətçi", "Abdurəhimov Yaşar Əhməd", "244-26-26"),
            StructureModel("Aparıcı məsləhətçi", "Xalıqov Şahin Ramazan", "244-23-75"),
            //  İstehsal və xidmət sahələri sektoru
            StructureModel("", "İSTEHSAL və XİDMƏT SƏHƏLƏRİ SEKTORU", ""),
            StructureModel("Sektor müdiri", "Abduləzizov Rəşad Saleh", "244-28-28"),
            StructureModel("Aparıcı məsləhətçi", "Məmmədov Elnur Zümrüd", "244-28-28"),
            //Memarlıq və tikinti şöbəsi
            StructureModel("", "MEMARLIQ və TİKİNTİ ŞÖBƏSİ", ""),
            StructureModel("Şöbə müdiri – baş memar", "Alxasov Taleh Saleh", "244-28-70"),
            StructureModel("Baş məsləhətçi (mühəndis)", "Əkbərov Etibar Hüsein", "244-29-83"),
            StructureModel(" Böyük məsləhətçi (mühəndis)", "İsmiyev Elxan Nuru", "244-29-83"),
            //Şəhər təsərrüfatı şöbəsi
            StructureModel("", "ŞƏHƏR TƏSƏRRÜFATI ŞÖBƏSİ", ""),
            StructureModel("Baş məsləhətçi", "İsmayılov Nizami Cuma", "244-65-75"),
            StructureModel("Böyük məsləhətçi", "Nəsibov Tərlan Məhəmməd", "244-25-64"),
            //Sənədlərlə və vətəndaşların müraciətləri ilə iş şöbəsi
            StructureModel("", "SƏNƏDƏRLƏ və VƏTƏNDAŞLARIN MÜRACİƏTLƏRİ ilə İŞ ŞÖBƏSİ", ""),
            StructureModel("Şöbə müdiri", "Mikayılov Daşqın Gündüz", "244-25-25"),

            StructureModel(
                "Məsləhətçi (kadrlar üzrə işin aparıcısı)", "Məmmədov Eldar Əliyəsər", "244-37-16"
            ),

            StructureModel(
                "Məsləhətçi (dəftərxana işinin aparıcısı)", "Abdullayev Rəvan Elşin", "244-27-27"
            ),

            StructureModel(
                "Məsləhətçi (vətəndaşların müraciətləri üzrə işin aparıcısı)",
                "Rəsulova Kəmalə Namiq",
                "244-27-27"
            ),
            StructureModel("Məsləhətçi", "Əliəşrəfova Şahnaz Mahmud", "244-27-27"),
            StructureModel("Baş mütəxəssis - sürücü", "Paşayev Mahir Qaybalı", "-"),
            StructureModel("Baş mütəxəssis - sürücü", "Teymurov Teymur Şakir", "-"),
            StructureModel("Baş mütəxəssis - sürücü", "Mustafayev Asim Paşa", "-"),
            StructureModel("Baş mütəxəssis - sürücü", "Rəsulov Soltan Həsənpaşa", "-"),

            StructureModel(
                "Baş mütəxəssis – komendant", "Hacıyev Rəfail Muradəli", "244-25-24"
            ),
            StructureModel("Xadimə", "Həsənova Əsli Camal", "-"),
            StructureModel("Xadimə", "Əhmədova Surayə Həsən", "-"),
        )
    }

    internal val administrationList: MutableLiveData<PersistentList<StructureModel>> = _administrationList
}