fun datasync(context: Context) {
    val settingsBundle = Bundle()
    settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true)
    settingsBundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true)
    ContentResolver.requestSync(null, context.resources.getString(R.string.content_authority), settingsBundle)
}

