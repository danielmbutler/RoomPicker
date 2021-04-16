# Room_Picker_App


## Images

<p align="center">
  <img src="https://github.com/danielmbutler/RoomPicker/blob/master/Resources/RoomListView.PNG" width="250" >
  <img src="https://github.com/danielmbutler/RoomPicker/blob/master/Resources/RoomDetailView.PNG" width="250">
  <img src="https://github.com/danielmbutler/RoomPicker/blob/master/Resources/RoomDetailViewIcons.PNG" width="250">
</p>


## Architecure
MVVM with LiveData and Network Bound Resource
Single source of truth for item retrieval , all results from the api are cached on the local Room Database and returned to the activites/fragments, cache is only cleared when the timestamp expires or if the DB returns empty results (Manual Override in settings)

API/RoomDB -> Repository -> ViewModel -> Fragments/Activities 
![alt text](https://github.com/danielmbutler/RoomPicker/blob/master/Resources/NetworkBoundResource.png)


### Caching Screenshots
Log showing that timestamp has expired on room object so the app will retrieve items from api.

![alt text](https://github.com/danielmbutler/RoomPicker/blob/master/Resources/roompickercache.PNG)

Manual override for clearing cache.
<p align="center">
  <img src="https://github.com/danielmbutler/RoomPicker/blob/master/Resources/RoomSettings.PNG" width="300">
</p>

