package com.theflexproject.thunder;

public class Constants {
    public static final String TMDB_GET_REQUEST_BASE_URL ="https://api.themoviedb.org/3/search/movie?api_key=";
    public static final String TMDB_BASE_URL = "https://api.themoviedb.org/3/";
    public static final String TMDB_IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500";
    public static final String TMDB_BACKDROP_IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w1280";
    public static final String FANART_IMAGE_BASE_URL = "https://webservice.fanart.tv/v3/";
    public static final String TMDB_API_KEY = "";
    public static final String SIMPLE_PROGRAM_DOWNLOAD_API = "https://geolocation.zindex.eu.org/generate.json?id=";
    public static final String CF_CACHE_TOKEN = "";

    public static String getFanartApiKey(){
        final String[] KEYS = {
                "5c2e0ee6a22231d910766a1cf166d580"};
        Random random = new Random();
        int index = random.nextInt(KEYS.length);
        return KEYS[index];
    }



}
