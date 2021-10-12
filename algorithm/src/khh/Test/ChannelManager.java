package khh.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChannelManager {

    
    /**
     * 아래 조건에 맞게 "정렬된 리스트" 로 관리하는 기능
     * - 채널 ID를 기준으로 오름차순으로 정렬
     * - 채널 ID가 동일한 항목은 “Radio<<TV<<TV/Radio” 우선순위 순으로 교체(1개만 유지)
    **/
    public List<Channel> sortChannelList(Map<Integer, Channel> channelMap){
        List<Channel> sortList = new ArrayList();
        for (int i = 0; i < channelMap.size(); i++){
            sortList.add(channelMap.get(i));
        }
        return sortList;
    }

}
