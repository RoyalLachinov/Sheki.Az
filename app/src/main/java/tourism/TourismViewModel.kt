package tourism

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import az.com.sheki.R
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

class TourismViewModel: ViewModel() {
    private val _tourismCentersList = MediatorLiveData<PersistentList<TourismModel>>().apply {
        value = persistentListOf(
            TourismModel(
                R.drawable.marxal,
                "Marxal Istirahət Mərkəzi",
                "Şəki şəhəri,Kiş kəndi"
            ),
            TourismModel(
                R.drawable.xansarayi,
                "Xan Sarayı",
                "AZ5503,Şəki,Mirzə Fətəli Axundov."
            ),
            TourismModel(
                R.drawable.karvansaray,
                "Karvansaray",
                "Şəki şəhəri,M.F.Axundov pros. 185,Şəki AZ5500. (+994 177) 4 48 14"
            ),
            TourismModel(
                R.drawable.shekipalace,
                "Şəki Palace",
                "Ünvan: \tAxundzadə pros, Şəki, Azərbaycan, AZ 5503"
            ),
            TourismModel(
                R.drawable.shekipark,
                "Şəki park",
                "Address: ŞƏKI ŞƏHƏRI, VAHABZADƏ KÜÇ. 486,\n SOYUQBULAQ, Kiş yolu,Phone:+994 24 246 08 03"
            ),
            TourismModel(
                R.drawable.shekixanovlarinevi,
                "Şəkixanovların evi",
                "Şəki şəhəri, «Yuxarı baş» Dövlət tarix-memarlıq qoruğu."
            ),
            TourismModel(
                R.drawable.sekisaray,
                "Şəki Saray Hotel",
                "M.E. Resulzade 187,\nAZ 5500,+994 2424 48181"
            ),
            TourismModel(
                R.drawable.olimpik,
                "Sheki Olimpic Hotel & Resort",
                "Ünvan: Salman Mümtaz küç 1,\nTel:+994 50 213 15 14\n\t\t+9942424 5 21 40"
            ),
            TourismModel(
                R.drawable.issam,
                "İSSAM - Rest & Welness Center",
                "Şəhriyar küçəsi Tel: + 994 24 244 87 81,\nMob: + 994 55 244 87 81 \nE-mail: office@issam.az, admin@issam.az"
            ),
            TourismModel(
                R.drawable.narinqala,
                "Narın Qala İstirahət Mərkəzi",
                "Ünvan:AZ5525,Şəki,Kiş,Məmməd Əmin Rəsulzadə küç.\nTelefon:\t(+994 2424) 4-01-64, (+994 2424) 4-53-00"
            ),
            TourismModel(
                R.drawable.kishmebedi2,
                "Kiş alban məbədi",
                "Ünvan:\tAZ5525,Şəki,Kiş,Kiş kənd yolu"
            ),
            TourismModel(
                R.drawable.cennetbagi,
                "Cənnət Bağı Istirahət Mərkəzi",
                " Şəki, Kiş kəndi ərazisi"
            )
        )
    }

    internal val tourismCentersList: MediatorLiveData<PersistentList<TourismModel>> = _tourismCentersList
}