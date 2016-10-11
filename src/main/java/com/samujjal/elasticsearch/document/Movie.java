package com.samujjal.elasticsearch.document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "PopcornMeter",
        "EventDate",
        "EventType",
        "isNewEvent",
        "EventStatus",
        "EventName",
        "EventCensor",
        "EventCode",
        "EventImageCode",
        "EventDimension",
        "imgurl",
        "isDefault",
        "EventDuration",
        "EventURL",
        "EventIsAtmosEnabled",
        "EventLanguage",
        "EventSynopsis",
        "EventProducerCode",
        "EventRating"
})
@Document(indexName = "moviedb", type = "movie")
public class Movie {

    @JsonProperty("Id")
    @Id
    private String id;
    @JsonProperty("PopcornMeter")
    private String popcornMeter;
    @JsonProperty("EventDate")
    private String eventDate;
    @JsonProperty("EventType")
    private String eventType;
    @JsonProperty("isNewEvent")
    private String isNewEvent;
    @JsonProperty("EventStatus")
    private String eventStatus;
    @JsonProperty("EventName")
    private String eventName;
    @JsonProperty("EventCensor")
    private String eventCensor;
    @JsonProperty("EventCode")
    private String eventCode;
    @JsonProperty("EventImageCode")
    private String eventImageCode;
    @JsonProperty("EventDimension")
    private String eventDimension;
    @JsonProperty("imgurl")
    private String imgurl;
    @JsonProperty("isDefault")
    private String isDefault;
    @JsonProperty("EventDuration")
    private String eventDuration;
    @JsonProperty("EventURL")
    private String eventURL;
    @JsonProperty("EventIsAtmosEnabled")
    private String eventIsAtmosEnabled;
    @JsonProperty("EventLanguage")
    private String eventLanguage;
    @JsonProperty("EventSynopsis")
    private String eventSynopsis;
    @JsonProperty("EventProducerCode")
    private String eventProducerCode;
    @JsonProperty("EventRating")
    private String eventRating;


    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The popcornMeter
     */
    @JsonProperty("PopcornMeter")
    public String getPopcornMeter() {
        return popcornMeter;
    }

    /**
     *
     * @param popcornMeter
     * The PopcornMeter
     */
    @JsonProperty("PopcornMeter")
    public void setPopcornMeter(String popcornMeter) {
        this.popcornMeter = popcornMeter;
    }

    /**
     *
     * @return
     * The eventDate
     */
    @JsonProperty("EventDate")
    public String getEventDate() {
        return eventDate;
    }

    /**
     *
     * @param eventDate
     * The EventDate
     */
    @JsonProperty("EventDate")
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    /**
     *
     * @return
     * The eventType
     */
    @JsonProperty("EventType")
    public String getEventType() {
        return eventType;
    }

    /**
     *
     * @param eventType
     * The EventType
     */
    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     *
     * @return
     * The isNewEvent
     */
    @JsonProperty("isNewEvent")
    public String getIsNewEvent() {
        return isNewEvent;
    }

    /**
     *
     * @param isNewEvent
     * The isNewEvent
     */
    @JsonProperty("isNewEvent")
    public void setIsNewEvent(String isNewEvent) {
        this.isNewEvent = isNewEvent;
    }

    /**
     *
     * @return
     * The eventStatus
     */
    @JsonProperty("EventStatus")
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     *
     * @param eventStatus
     * The EventStatus
     */
    @JsonProperty("EventStatus")
    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     *
     * @return
     * The eventName
     */
    @JsonProperty("EventName")
    public String getEventName() {
        return eventName;
    }

    /**
     *
     * @param eventName
     * The EventName
     */
    @JsonProperty("EventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     *
     * @return
     * The eventCensor
     */
    @JsonProperty("EventCensor")
    public String getEventCensor() {
        return eventCensor;
    }

    /**
     *
     * @param eventCensor
     * The EventCensor
     */
    @JsonProperty("EventCensor")
    public void setEventCensor(String eventCensor) {
        this.eventCensor = eventCensor;
    }

    /**
     *
     * @return
     * The eventCode
     */
    @JsonProperty("EventCode")
    public String getEventCode() {
        return eventCode;
    }

    /**
     *
     * @param eventCode
     * The EventCode
     */
    @JsonProperty("EventCode")
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     *
     * @return
     * The eventImageCode
     */
    @JsonProperty("EventImageCode")
    public String getEventImageCode() {
        return eventImageCode;
    }

    /**
     *
     * @param eventImageCode
     * The EventImageCode
     */
    @JsonProperty("EventImageCode")
    public void setEventImageCode(String eventImageCode) {
        this.eventImageCode = eventImageCode;
    }

    /**
     *
     * @return
     * The eventDimension
     */
    @JsonProperty("EventDimension")
    public String getEventDimension() {
        return eventDimension;
    }

    /**
     *
     * @param eventDimension
     * The EventDimension
     */
    @JsonProperty("EventDimension")
    public void setEventDimension(String eventDimension) {
        this.eventDimension = eventDimension;
    }

    /**
     *
     * @return
     * The imgurl
     */
    @JsonProperty("imgurl")
    public String getImgurl() {
        return imgurl;
    }

    /**
     *
     * @param imgurl
     * The imgurl
     */
    @JsonProperty("imgurl")
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     *
     * @return
     * The isDefault
     */
    @JsonProperty("isDefault")
    public String getIsDefault() {
        return isDefault;
    }

    /**
     *
     * @param isDefault
     * The isDefault
     */
    @JsonProperty("isDefault")
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     *
     * @return
     * The eventDuration
     */
    @JsonProperty("EventDuration")
    public String getEventDuration() {
        return eventDuration;
    }

    /**
     *
     * @param eventDuration
     * The EventDuration
     */
    @JsonProperty("EventDuration")
    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    /**
     *
     * @return
     * The eventURL
     */
    @JsonProperty("EventURL")
    public String getEventURL() {
        return eventURL;
    }

    /**
     *
     * @param eventURL
     * The EventURL
     */
    @JsonProperty("EventURL")
    public void setEventURL(String eventURL) {
        this.eventURL = eventURL;
    }

    /**
     *
     * @return
     * The eventIsAtmosEnabled
     */
    @JsonProperty("EventIsAtmosEnabled")
    public String getEventIsAtmosEnabled() {
        return eventIsAtmosEnabled;
    }

    /**
     *
     * @param eventIsAtmosEnabled
     * The EventIsAtmosEnabled
     */
    @JsonProperty("EventIsAtmosEnabled")
    public void setEventIsAtmosEnabled(String eventIsAtmosEnabled) {
        this.eventIsAtmosEnabled = eventIsAtmosEnabled;
    }

    /**
     *
     * @return
     * The eventLanguage
     */
    @JsonProperty("EventLanguage")
    public String getEventLanguage() {
        return eventLanguage;
    }

    /**
     *
     * @param eventLanguage
     * The EventLanguage
     */
    @JsonProperty("EventLanguage")
    public void setEventLanguage(String eventLanguage) {
        this.eventLanguage = eventLanguage;
    }

    /**
     *
     * @return
     * The eventSynopsis
     */
    @JsonProperty("EventSynopsis")
    public String getEventSynopsis() {
        return eventSynopsis;
    }

    /**
     *
     * @param eventSynopsis
     * The EventSynopsis
     */
    @JsonProperty("EventSynopsis")
    public void setEventSynopsis(String eventSynopsis) {
        this.eventSynopsis = eventSynopsis;
    }

    /**
     *
     * @return
     * The eventProducerCode
     */
    @JsonProperty("EventProducerCode")
    public String getEventProducerCode() {
        return eventProducerCode;
    }

    /**
     *
     * @param eventProducerCode
     * The EventProducerCode
     */
    @JsonProperty("EventProducerCode")
    public void setEventProducerCode(String eventProducerCode) {
        this.eventProducerCode = eventProducerCode;
    }

    /**
     *
     * @return
     * The eventRating
     */
    @JsonProperty("EventRating")
    public String getEventRating() {
        return eventRating;
    }

    /**
     *
     * @param eventRating
     * The EventRating
     */
    @JsonProperty("EventRating")
    public void setEventRating(String eventRating) {
        this.eventRating = eventRating;
    }

}
