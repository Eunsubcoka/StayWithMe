package kr.co.swm.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SellerDto {

    // 관리자 정보
    private int sellerKey;
    private String sellerId;
    private String sellerType;

    // 숙소 정보
    private int accommodationNo;
    private String accommodationName;
    private String accommodationType;
    private String accommodationPhone;
    private String accommodationPost;
    private String accommodationAddress;

    // 객실 정보
    private int roomNo;
    private int roomTypeNo;
    private String roomName;
    private String roomCheckIn;
    private String roomCheckOut;
    private int roomPersonnel;
    private int roomMaxPersonnel;
    private int roomvalues;

    // 객실 요금 정보
    private int roomRateNo;
    private String basicRoomName;
    private int basicDayNo;
    private int basicRate;
    private int weekdayRate;
    private int fridayRate;
    private int saturdayRate;
    private int sundayRate;

    // 추가 요금 정보
    private List<ExtraDto> extraRates = new ArrayList<>();  // 기본 초기화

    @Getter
    @Setter
    public static class ExtraDto {
        private int extraRoomNo;
        private int extraNo;
        private int extraDayNo;
        private String extraName;
        private String extraDateStart;
        private String extraDateEnd;
        private int extraRate;
        private int extraWeekdayRate;
        private int extraFridayRate;
        private int extraSaturdayRate;
        private int extraSundayRate;
    }
}


