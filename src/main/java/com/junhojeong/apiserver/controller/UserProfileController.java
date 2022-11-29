package com.junhojeong.apiserver.controller;

import com.junhojeong.apiserver.mapper.UserProfileMapper;
import com.junhojeong.apiserver.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserProfileController {

    // Mapper 사용
    private UserProfileMapper userProfileMapper;

    public UserProfileController(UserProfileMapper mapper) {
        this.userProfileMapper = mapper;
    }

//    private Map<String, UserProfile> userMap;
//
//    @PostConstruct
//    public void init() {
//        userMap = new HashMap<String, UserProfile>();
//        userMap.put("1", new UserProfile("1", "홍길동", "111-1111", "서울시 강남구 대치동 1동"));
//        userMap.put("2", new UserProfile("2", "홍길자", "111-1111", "서울시 강남구 대치동 2동"));
//        userMap.put("3", new UserProfile("3", "홍길순", "111-1111", "서울시 강남구 대치동 3동"));
//    }

    // API 들
    // 데이터 조회
    @GetMapping("/{id}")
    public UserProfile getUserProfile(@PathVariable("id") String id) {
        // return userMap.get(id);
        return userProfileMapper.getUserProfile(id);    // json 형태
    }

    @GetMapping("/all")
    public List<UserProfile> getUserProfileList() {
        // return new ArrayList<UserProfile>(userMap.values());
        return userProfileMapper.getUserProfileList();
    }

    // 데이터 수정
    @PostMapping("/{id}")
    public int updateUserProfile(@PathVariable("id") String id, @RequestParam("name") String name,
                                @RequestParam("phone") String phone, @RequestParam("address") String address) {
//        UserProfile userProfile = userMap.get(id);
//        userProfile.setName(name);
//        userProfile.setPhoneNum(phone);
//        userProfile.setAddress(address);
        return userProfileMapper.updateUserProfile(id, name, phone, address);
    }

    // 데이터 삽입. 통상적으로 주소에는 하나만, RequestParam으로 데이터 전송. RestAPI client로 테스트(ex. postman)
    @PutMapping("/{id}")
    public int insertUserProfile(@PathVariable("id") String id, @RequestParam("name") String name,
                               @RequestParam("phone") String phone, @RequestParam("address") String address) {
//        UserProfile userProfile = new UserProfile(id, name, phone, address);
//        userMap.put(id, userProfile);
        return userProfileMapper.insertUserProfile(id, name, phone, address);
    }

    // 데이터 삭제
    @DeleteMapping("/{id}")
    public int deleteUserProfile(@PathVariable("id") String id) {
//        userMap.remove(id);
        return userProfileMapper.deleteUserProfile(id);
    }

    // mysql connect 와 mapping 라이브러리 필요
}
