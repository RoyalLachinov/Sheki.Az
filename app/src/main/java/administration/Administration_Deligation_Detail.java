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
public class Administration_Deligation_Detail extends Fragment {

    private FragmentTransaction fragmentTransaction;

    public Administration_Deligation_Detail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sheki_administration__deligate, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listViewDeligate);

        List<Administration_Structure_Entity> list = new ArrayList<>();
        //1 nömrəli Sahə İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "1 nömrəli SAHƏ İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Həsənov Rasim", "244-90-34"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Əliyev Mehman", "244-90-14"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi - baş mühasib", "Xəlilov Nizami", "244-90-14"));
        list.add(new Administration_Structure_Entity("Məsləhətçi (mühəndis)", "Qaffarov Elçin", "--"));
        list.add(new Administration_Structure_Entity("Aparıcı mütəxəssis", "Səlimova Samirə", "--"));
        //Baş Zəyzid kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BAŞ ZƏYZİD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Müslimov Ələşrəf", "24 95-1-54"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Novruzov Elşad", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Həbibullayev Elşad", "--"));
        //Orta  Zəyzid kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "ORTA ZƏYZİD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Mustafayeva Xuraman", "24 94-1-48"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Hüseynov Fikrət ", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Məmmədova Könül", "--"));
        //Aşağı Küngüt kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "AŞAĞI KÜNGÜT kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Səfərov Ehsan ", "24 91-1-19"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Məmmədov Ərəstun", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Əsgərova Məlahət", "--"));
        //İbrahimkənd kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "İBRAHİMKƏND kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Məmmədov İlqar", "24 91-2-06"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Abdulkərimov Abdulla", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Qocayev Yaşar", "--"));
        //Baş Kəldək kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BAŞ KƏLDƏK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Məsimov Cavanşir", "24 90-4-72"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Abdurahmanov Emin", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "--", "--"));
        //Aydınbulaq kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "AYDINBULAQ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Vəliyev Elçin", "24 39-2-52"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Tağıyev Yadigar", "24 39-1-43"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Səlimli Azər", "--"));
        //Şirinbulaq kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "ŞİRİNBULAQ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə","Dostuyev Tapdıq", "24 58-4-29"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Qurbanov Kərim", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Səlimov Şəmşir", "--"));
        //Baş Küngüt kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BAŞ KÜNGÜT kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK",""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Məmmədov Kazım", "24 73-1-45"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Babayev Araz", "24 73-1-37"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Paşayeva Pərvanə", "--"));
        //Turan qəsəbə İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "TURAN qəsəbə İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Tağıyev Nağı", "24 71-3-34"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Piriyev Elşən", "24 71-3-35"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Mövlamov Rövşən", "--"));
        //Bolludərə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BOLLUDƏRƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Həsənov Sahib", "24 78-4-46"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Məmmədov Rizvan", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "--", "--"));
        //Qayabaşı kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "QAYABAŞI kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Məsimov Əmir", "24 78-2-40"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Ramazanov Ramiz", "24 78-2-88"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Salahov Mirzə", "--"));
        //Cəfərabad kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "CƏFƏRƏBAD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Mustafayev Sübhan", "24 38-1-72"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Qədimov Xəyyam", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Mustafayev Tariyel", "--"));
        //Suçma kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "SUÇMA kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Abdullayev Həsən", "24 37-1-10"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Əlipaşayev Şahin", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Şamilov Azər", "--"));
        //Çeşməli kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "ÇEŞMƏLİ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "İbrahimxəlilov Zabir", "044-277-01-35"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Rəhimov Vüqar", "--"));
        list.add(new Administration_Structure_Entity("Baş məsləhətçi mühasib", "Sədiyev Əhməd-Muxtar", "--"));
        //Şəki kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "ŞƏKİ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Məmmədova Zərifə", "24 33-2-68"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Tağıyeva Mehriban", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Kazımov Fikrət", "--"));
        //Cəyirli kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "CƏYİRLİ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Həsənov Vaqif", "24 77-1-99"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Ismayilov Farzali", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Ramazanov Zaman", "--"));
        //Oxud kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "OXUD kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Əhmədov Oruc", "24 30-1-54"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Yusifov Elmar", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Məhyəddinov Zaur", "--"));
        //Baltalı kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BALTALI kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Manafov Etibar", "24 31-1-18"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Eyvazova Könül", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Rəsulov Turqut", "--"));
        //İnçə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "İNÇƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Əhmədov Vahid", "24 34-1-42"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Umudov Nəriman", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Xəlilli Elnur", "--"));
        //Baş Göynük kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BAŞ GÖYNÜK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Calalov Rza", "24 92-1-17"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Rəsulov Məmməd", "24 92-1-72"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "İsmayılov Əhəd", "--"));
        //Aşağı Göynük kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "AŞAĞI GÖYNÜK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Əliyev Əfqan", "24 96-1-15"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Hümbətov Yusif", "24 96-1-33"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Həsənova Şəfəq", "--"));
        //Baş Layısqı kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BAŞ LAYISQI kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Nəbiyev Asif", "24 93-1-36"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Yusibov Nizami", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "İsmayılov Cuma", "--"));
        //Biləcik kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BİLƏCİK kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Xasıyev Xalis", "24 99-2-10"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Məmmədov Tariyel", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Məmmədov Azər", "--"));
        //Qoxmuq kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "QOXMUQ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Həsənov İlqar", "24 4-16-38"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Əliyev Zeynal", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Mustafayev Vüsal", "--"));
        //Kiş kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "KİŞ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Yusifov Mürvət", "24 98-4-98"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Həbibullayev Maqsud", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Həşimov Azad", "--"));
        //Daşüz kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "DAŞÜZ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Əliyev İlqar", "24 32-2-30"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Məmmədov Rövşən", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Mustafayev Elçin", "--"));
        //Küdürlü kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "KÜDRLÜ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Əmraslanova Təranə", "044-277-10-38"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "İbrahimov Xəyyam", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Məmmədov Məmməd", "--"));
        //Qudula kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "QUDULA kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Cumayev Rəşad", "24 97-2-27"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Həsrətov Ramin", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "--", "--"));
        //Cumakənd kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "CUMAKƏND kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Mahmuov Oruc", "24 75-1-37"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Səmədov Söhrab", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "--", "--"));
        //Şorsu kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "ŞORSU kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Əliyev Mustafa", "24 72-1-10"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "İsmayılov Qurban", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "--", "--"));
        //Böyük Dəhnə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "BÖYÜK DƏHNƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Yusifov Asif", "24 36-1-67"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "--", "24 36-1-50"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Xəlilov Tehran", "--"));
        //Kiçik Dəhnə kənd İnzibati Ərazi Dairəsi üzrə nümayəndəlik
        list.add(new Administration_Structure_Entity("", "KİÇİI DƏHNƏ kənd İNZİBATİ ƏRAZİ DAİRƏSİ üzrə NÜMAYƏNDƏLİK", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Mirhəsənov Aslan", "24 35-1-35"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Manafov Seyran", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Axundov Səməd", "--"));
        //Çələbixan qəsəbə icra nümayəndəliyi
        list.add(new Administration_Structure_Entity("", "ÇƏLƏBİXAN qəsəbə İCRA NÜMAYƏNDƏLİYİ", ""));
        list.add(new Administration_Structure_Entity("Nümayəndə", "Ağabalayev İlqar", "24 38-1-68"));
        list.add(new Administration_Structure_Entity("Nümayəndənin müavini", "Yusifov Rasim", "--"));
        list.add(new Administration_Structure_Entity(" Baş məsləhətçi mühasib", "Qarayev Etibar", "--"));

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
