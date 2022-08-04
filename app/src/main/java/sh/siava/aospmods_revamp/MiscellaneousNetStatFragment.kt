package sh.siava.aospmods_revamp

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class MiscellaneousNetStatFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}