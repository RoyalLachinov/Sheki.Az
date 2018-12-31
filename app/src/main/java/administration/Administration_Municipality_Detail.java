package administration;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import lachinov.royal.com.main.R;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressWarnings("ConstantConditions")
public class Administration_Municipality_Detail extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Administration_Municipality_Detail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_administration_municipality, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewManicipality);
        List<Administration_Structure_Entity> list = new ArrayList<>();
        list.add(new Administration_Structure_Entity("", "Şəki ŞƏHƏR BƏLƏDİYYƏSİ", ""));
        list.add(new Administration_Structure_Entity("sədr", "İbadov Elşad Sırac oğlu", "244-00-51"));
        list.add(new Administration_Structure_Entity("müavin", "Nuriyev Ehtibar Məsim oğlu", "244-89-37"));
        list.add(new Administration_Structure_Entity("müavin", "Salamova Gülnaz Mustafa qızı", "244-58-90"));
        list.add(new Administration_Structure_Entity("müavin", "Həbibullayev Şirin Mövsüm oğlu", "244-46-83"));
        //Aşağı Göynük bələdiyyəsi
        list.add(new Administration_Structure_Entity("","AŞAĞI GÖYNÜK BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Hüseynəliyev Asif Şamil oğlu","24- 96-4-02"));
        list.add(new Administration_Structure_Entity("müavin","İsmayılov Elsevər Mahmud oğlu",""));
        //Aşağı Layısqı bələdiyyəsi
        list.add(new Administration_Structure_Entity("","AŞAĞI LAYISQI BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Məmmədova Ləman Tofiq qızı","24-96-5-99"));
        list.add(new Administration_Structure_Entity("müavin","Səmədov Rakif Əliəhməd","--"));
        //Baş Göynük bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BAŞ GÖYNÜK BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Məmmədov Vüqar Fərman  oğlu","24-92-1-41"));
        list.add(new Administration_Structure_Entity("müavin","Bəkirov İslam Şükür  oğlu",""));
        //Baş Layısqı bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BAŞ LAYISQI BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Sərkərova Türkay Şöhrət  qızı","24-93-0-76"));
        list.add(new Administration_Structure_Entity("müavin","İsmayılova Zenfira Məmməd qızı","--"));
        //Birinci Biləcik bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BİRİNCİ BİLƏCİK BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Həsənov Müşfiq Şamil oğlu","24-99-3-10"));
        list.add(new Administration_Structure_Entity("müavin","Xəlilov Samir Qüdrət oğlu","--"));
        //
        list.add(new Administration_Structure_Entity("","BÖYÜK DƏHNƏ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Mürsəlov Kərəm Mürsəl  oğlu","24-36-1-84"));
        list.add(new Administration_Structure_Entity("müavin","Xəlilov İbrahimxəlil Məmət oğlu","--"));
        //Cumakənd bələdiyyəsi
        list.add(new Administration_Structure_Entity("","CUMAKƏND BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Kərimov Asif Məmməd oğlu","24-75-1-42"));
        list.add(new Administration_Structure_Entity("müavin","İsmayılov Məmməd Bayram oğlu","--"));
        //Daşüz bələdiyyəsi
        list.add(new Administration_Structure_Entity("","DAŞÜZ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Yusubov İsmət Bəşir oğlu","24-32-2-14"));
        list.add(new Administration_Structure_Entity("müavin","Əsgərov Ramiz Osman   oğlu","--"));
        //İkinci Biləcik bələdiyyəsi
        list.add(new Administration_Structure_Entity("","İKİNCİ BİLƏCİK BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Məmmədova Sara Əhmədiyyə qızı","24-99-1-19"));
        list.add(new Administration_Structure_Entity("müavin","Abbasov Cavid Yaşar oğlu","--"));
        //İnçə bələdiyyəsi
        list.add(new Administration_Structure_Entity("","İNÇƏ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Mustafayev Qafqaz Hüseyn oğlu","24-34-2-12"));
        list.add(new Administration_Structure_Entity("müavin","Abduləlimov İftixar Məmməd oğlu","--"));
        //Kiçik Dəhnə bələdiyyəsi
        list.add(new Administration_Structure_Entity("","KİÇİK DƏHNƏ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Calalov Əlvida Baba oğlu","24-35-2-73"));
        list.add(new Administration_Structure_Entity("müavin","Səlimov   Yusif  Vaqif","--"));
        //Qudula bələdiyyəsi
        list.add(new Administration_Structure_Entity("","QUDULA BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Əliyeva Lalə Abdulləli qızı","24-97-2-11"));
        list.add(new Administration_Structure_Entity("müavin","Salamov Nəcəf Rəcəb oğlu","--"));
        //Oxud bələdiyyəsi
        list.add(new Administration_Structure_Entity("","OXUD BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Abdullayeva Brilyant Seyidəzim qızı","24-30-1-23"));
        list.add(new Administration_Structure_Entity("müavin","Salamov Cumay Vaqif   oğlu","--"));
        //Şin bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ŞİN BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Həsənova Nəzakət Qüdrət qızı","--"));
        list.add(new Administration_Structure_Entity("müavin","Həsənov Namiq Qüdrət oğlu","--"));
        //Şorsu bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ŞORSU BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Hacəliyev Samir Ramiz  oğlu","24-72-2-25"));
        list.add(new Administration_Structure_Entity("müavin","Aslanov Novruz Həbillah  oğlu","--"));
        //Zunud bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ZUNUD BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Səfərəliyeva Nərgiz İsmayıl qızı","24-34-1-30"));
        list.add(new Administration_Structure_Entity("müavin","Baxışova Həbibə Mübariz qızı","--"));
        //Baltalı bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BALTALI BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Tağızadə İmral  Şahid oğlu","24-31-1-22"));
        list.add(new Administration_Structure_Entity("müavin","Tağıyev Şahid Tağı  oğlu","--"));
        //Kiş bələdiyyəsi
        list.add(new Administration_Structure_Entity("","KİŞ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Nurməmmədov Tərlan Niyazi oğlu","24-98-6-08"));
        list.add(new Administration_Structure_Entity("müavin","Həşimova Dinar Kamil  qızı",""));
        //Küdürlü bələdiyyəsi
        list.add(new Administration_Structure_Entity("","KÜDÜRLÜ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","İmamov Elsəvər Elçin oğlu","--"));
        list.add(new Administration_Structure_Entity("müavin","Şirinov Əlim Zahid   oğlu","--"));
        //Qoxmuq bələdiyyəsi
        list.add(new Administration_Structure_Entity("","QOXMUQ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Rüstəmova Sevinc İmran qızı","24-4-08-16"));
        list.add(new Administration_Structure_Entity("müavin","Rüstəmov Fətəli Nütvəli oğlu","--"));
        //Suçma bələdiyyəsi
        list.add(new Administration_Structure_Entity("","SUÇMA BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Süleymanov Sahil Hafiz oğlu","24-37-1-17"));
        list.add(new Administration_Structure_Entity("müavin","Həsrətov Həsən Bəhərçin oğlu","--"));
        //Şəki kənd bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ŞƏKİ KƏND BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Bağırova İzarə Əli qızı","24-33-1-84"));
        list.add(new Administration_Structure_Entity("müavin","Əliyev Müslüm Bayram oğlu","--"));
        //Aşağı Küngüt bələdiyyəsi
        list.add(new Administration_Structure_Entity("","AŞAĞI KÜNGÜT BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Cəlilova Kəmalə Məmməd qızı","24-91-1-19"));
        list.add(new Administration_Structure_Entity("müavin","Lətifova Zümrüd Cuma qızı","--"));
        //Aydınbulaq bələdiyyəsi
        list.add(new Administration_Structure_Entity("","AYDINBULAQ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Əliyeva Çinarə Məmməd qızı","24-39-1-90"));
        list.add(new Administration_Structure_Entity("müavin","Dostuyev Bahadur Oruc oğlu","--"));
        //Baş Kəldək bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BAŞ KƏLDƏK BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Məsimov Elçin Yusif oglu","24-90-4-18"));
        list.add(new Administration_Structure_Entity("müavin","Məmmədov Sadiq Sabir oğlu","--"));
        //Baş Küngüt bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BAŞ KÜNGÜT BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Əhmədova Tutu Abdulla qızı","24-73-1-22"));
        list.add(new Administration_Structure_Entity("müavin","Bayramov Əlibala Nəsir oğlu","--"));
        //Baş Zəyzid bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BAŞ ZƏYZİD BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Abduləzizov Rəşad Umar oğlu","24-95-1-44"));
        list.add(new Administration_Structure_Entity("müavin","Məcidov Kamil Məmmədiyə oğlu","--"));
        //Bideyiz bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BİDEYİZ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","İsmayılov Müseyif  Şöyüb oğlu","24-74-2-03"));
        list.add(new Administration_Structure_Entity("müavin","İsmayılova Aygün Ramiz qızı","--"));
        //Bolludərə bələdiyyəsi
        list.add(new Administration_Structure_Entity("","BOLLUDƏRƏ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Rəcəbov Mehman Elməddin oğlu","24-78-4-46"));
        list.add(new Administration_Structure_Entity("müavin","Qədirov Yasər Fəxrəddin oğlu","--"));
        //Cəfərabad bələdiyyəsi
        list.add(new Administration_Structure_Entity("","CƏFƏRABAD BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Tanrıverdiyev Yaqub Köçəri oğlu","24-38-1-84"));
        list.add(new Administration_Structure_Entity("müavin","Məmmədov Turan Xanlar  oğlu","--"));
        //Cəyirli bələdiyyəsi
        list.add(new Administration_Structure_Entity("","CƏYİRLİ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Qarayeva Mirvari Qara qızı","24-77-1-55"));
        list.add(new Administration_Structure_Entity("müavin","Əliyev Etibar Qardaşbəy oğlu","--"));
        //Çayqaraqoyunlu bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ÇAYQARAQOYUNLU BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Namazov Sərkar Qədər oğlu","24-71-2-33"));
        list.add(new Administration_Structure_Entity("müavin","Səfərov Mansur Səfər oğlu","--"));
        //Çeşməli bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ÇEŞMƏLİ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Məmmədov Məmmədəli Qədir oğlu","--"));
        list.add(new Administration_Structure_Entity("müavin","Bəkirova Aygün Kərəm qızı","--"));
        //İbrahimkənd bələdiyyəsi
        list.add(new Administration_Structure_Entity("","İBRAHİMKƏND BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Rəhimova Nərminə Əbülfəz qızı","24-91-2-06"));
        list.add(new Administration_Structure_Entity("müavin","Əyyubov İsmayıl Şaban oğlu","--"));
        //Qayabaşı bələdiyyəsi
        list.add(new Administration_Structure_Entity("","QAYABAŞI BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Əliyev Sahib Əli  oğlu","24-78-3-59"));
        list.add(new Administration_Structure_Entity("müavin","Rəhimov Qurban Abdurahman oğlu","--"));
        //Orta Zəyzid bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ORTA ZƏYZİD BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Musayev Novruz Oruc oğlu","24-94-1-16"));
        list.add(new Administration_Structure_Entity("müavin","Əbdürəhimov Yusif Lıətif oğlu","--"));
        //Şirinbulaq bələdiyyəsi
        list.add(new Administration_Structure_Entity("","ŞİRİNBULAQ BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Vəliyev Şubay  Baxşəli oğlu","--"));
        list.add(new Administration_Structure_Entity("müavin","Qurbanov Vakif Qərib oğlu","--"));
        //Turan bələdiyyəsi
        list.add(new Administration_Structure_Entity("","TURAN BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Heydərova Narıngül Elağa qızı","24-71-2-45"));
        list.add(new Administration_Structure_Entity("müavin","Səmədov Ramiz Baba oğlu","--"));
        //Vərəzət bələdiyyəsi
        list.add(new Administration_Structure_Entity("","VƏRƏZƏT BƏLƏDİYYƏSİ",""));
        list.add(new Administration_Structure_Entity("sədr","Nəsirova Mənsurə Nurməmməd qızı","24-95-1-99"));
        list.add(new Administration_Structure_Entity("müavin","Mustafayev Ramin Ələsgər oğlu","--"));

        Administration_Structure_Adapter adapter = new Administration_Structure_Adapter(getActivity(),list);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    Administration_Main_Page main_page = new Administration_Main_Page();
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, main_page);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                    return true;

                }
                return false;
            }
        });
    }
}
