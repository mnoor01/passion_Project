package com.example.c4q.passionproject.call;

import com.example.c4q.passionproject.models.elections.ElectionResponse;
import com.example.c4q.passionproject.models.representatives.RepResponse;
import com.example.c4q.passionproject.models.voterinfo.VoterResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by c4q on 5/6/18.
 */

public interface LocalCall {
    @GET("elections")
    Call<ElectionResponse> getElection(
            @Query("key") String API_KEY,
            @Query("address") String address,
            @Query("electionId") int electionId);

    @GET("representatives")
    Call<RepResponse> getReps(
            @Query("key") String API_KEY,
            @Query("address") String address,
            @Query("electionId") int electionId);
    @GET("voterinfo")
    Call<VoterResponse> getVoterInfo(
            @Query("key") String API_KEY,
            @Query("address") String address,
            @Query("electionId") int electionId);
}

