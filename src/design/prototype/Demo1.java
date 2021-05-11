package design.prototype;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 利用对已有对象（原型）进行复制（或者叫拷贝）的方式，来创建新对象
 * TODO 尚未完成
 *
 * @author fab
 * @date 2021/5/8
 */
public class Demo1
{
    private ConcurrentHashMap<String, SearchWord> currentKeywords = new ConcurrentHashMap<>();

    private long lastUpdateTime = -1;

    public void refresh()
    {
        List<SearchWord> toBeUpdatedSearchWord = getSearchWord();
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWord)
        {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime)
            {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }

            if (currentKeywords.containsKey(searchWord.getKeyword()))
            {
                currentKeywords.replace(searchWord.getKeyword(), searchWord);
            }
            else
            {
                currentKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }

        lastUpdateTime = maxNewUpdatedTime;



    }

    private List<SearchWord> getSearchWord()
    {
        return null;
    }
}
