package sh.siava.aospmods_revamp

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class NavigationBar3BNavFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}