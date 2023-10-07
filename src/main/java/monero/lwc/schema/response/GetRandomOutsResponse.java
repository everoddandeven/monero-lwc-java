package monero.lwc.schema.response;

import monero.lwc.schema.RandomOutput;

public class GetRandomOutsResponse extends LWSResponse {
    public RandomOutput[] amountOuts;

    public GetRandomOutsResponse(RandomOutput[] amountOuts)
    {
        this.amountOuts = amountOuts;
    }
}