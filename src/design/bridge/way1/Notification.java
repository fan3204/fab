package design.bridge.way1;

import java.util.List;

/**
 * TODO
 *
 * @author fab
 * @date 2021/5/10
 */
public class Notification
{
    private List<String> emailAddresses;
    private List<String> telephones;
    private List<String> wechatIds;

    public void setEmailAddresses(List<String> emailAddresses)
    {
        this.emailAddresses = emailAddresses;
    }

    public void setTelephones(List<String> telephones)
    {
        this.telephones = telephones;
    }

    public void setWechatIds(List<String> wechatIds)
    {
        this.wechatIds = wechatIds;
    }


    public void notify(NotificationEmergencyLevel level, String message)
    {
        if (level.equals(NotificationEmergencyLevel.SEVERE))
        {
        }
        else if (level.equals(NotificationEmergencyLevel.URGENCY))
        {
        }
        else if (level.equals(NotificationEmergencyLevel.NORMAL))
        {
        }
        else if(level.equals(NotificationEmergencyLevel.TRIVIAL))
        {
        }
    }
}
