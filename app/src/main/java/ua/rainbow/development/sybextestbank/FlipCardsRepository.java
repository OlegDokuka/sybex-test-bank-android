package ua.rainbow.development.sybextestbank;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FlipCardsRepository {
    @GET("{id}")
    Call<FlipCards> list(@Path("id") int id);
}
