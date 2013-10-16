package com.vaadin.addon.touchkit.extensions;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.server.Page;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Button;
import com.vaadin.ui.TabSheet.Tab;

/**
 * This set includes some icons bundled in TouchKit that can be used to decorate
 * various buttons.
 * 
 * TODO proper documentation with examples e.g. how to add to TabBarView.
 * 
 * FIXME Add be better crafted solution for icon font or consider using Marc's
 * tool (haven't look at it at all). If possible, with icons that suit better
 * for the new theme (= lighter).
 */
public enum TouchKitIcon {

    glass("f000"), music("f001"), search("f002"), envelopeAlt("f003"), heart(
            "f004"), star("f005"), starEmpty("f006"), user("f007"), film("f008"), thLarge(
            "f009"), th("f00a"), thList("f00b"), ok("f00c"), remove("f00d"), zoomIn(
            "f00e"), zoomOut("f010"), off("f011"), signal("f012"), cog("f013"), trash(
            "f014"), home("f015"), fileAlt("f016"), time("f017"), road("f018"), downloadAlt(
            "f019"), download("f01a"), upload("f01b"), inbox("f01c"), playCircle(
            "f01d"), repeat("f01e"), refresh("f021"), listAlt("f022"), lock(
            "f023"), flag("f024"), headphones("f025"), volumeOff("f026"), volumeDown(
            "f027"), volumeUp("f028"), qrcode("f029"), barcode("f02a"), tag(
            "f02b"), tags("f02c"), book("f02d"), bookmark("f02e"), print("f02f"), camera(
            "f030"), font("f031"), bold("f032"), italic("f033"), textHeight(
            "f034"), textWidth("f035"), alignLeft("f036"), alignCenter("f037"), alignRight(
            "f038"), alignJustify("f039"), list("f03a"), indentLeft("f03b"), indentRight(
            "f03c"), facetimeVideo("f03d"), picture("f03e"), pencil("f040"), mapMarker(
            "f041"), adjust("f042"), tint("f043"), edit("f044"), share("f045"), check(
            "f046"), move("f047"), stepBackward("f048"), fastBackward("f049"), backward(
            "f04a"), play("f04b"), pause("f04c"), stop("f04d"), forward("f04e"), fastForward(
            "f050"), stepForward("f051"), eject("f052"), chevronLeft("f053"), chevronRight(
            "f054"), plusSign("f055"), minusSign("f056"), removeSign("f057"), okSign(
            "f058"), questionSign("f059"), infoSign("f05a"), screenshot("f05b"), removeCircle(
            "f05c"), okCircle("f05d"), banCircle("f05e"), arrowLeft("f060"), arrowRight(
            "f061"), arrowUp("f062"), arrowDown("f063"), shareAlt("f064"), resizeFull(
            "f065"), resizeSmall("f066"), plus("f067"), minus("f068"), asterisk(
            "f069"), exclamationSign("f06a"), gift("f06b"), leaf("f06c"), fire(
            "f06d"), eyeOpen("f06e"), eyeClose("f070"), warningSign("f071"), plane(
            "f072"), calendar("f073"), random("f074"), comment("f075"), magnet(
            "f076"), chevronUp("f077"), chevronDown("f078"), retweet("f079"), shoppingCart(
            "f07a"), folderClose("f07b"), folderOpen("f07c"), resizeVertical(
            "f07d"), resizeHorizontal("f07e"), barChart("f080"), twitterSign(
            "f081"), facebookSign("f082"), cameraRetro("f083"), key("f084"), cogs(
            "f085"), comments("f086"), thumbsUpAlt("f087"), thumbsDownAlt(
            "f088"), starHalf("f089"), heartEmpty("f08a"), signout("f08b"), linkedinSign(
            "f08c"), pushpin("f08d"), externalLink("f08e"), signin("f090"), trophy(
            "f091"), githubSign("f092"), uploadAlt("f093"), lemon("f094"), phone(
            "f095"), checkEmpty("f096"), bookmarkEmpty("f097"), phoneSign(
            "f098"), twitter("f099"), facebook("f09a"), github("f09b"), unlock(
            "f09c"), creditCard("f09d"), rss("f09e"), hdd("f0a0"), bullhorn(
            "f0a1"), bell("f0a2"), certificate("f0a3"), handRight("f0a4"), handLeft(
            "f0a5"), handUp("f0a6"), handDown("f0a7"), circleArrowLeft("f0a8"), circleArrowRight(
            "f0a9"), circleArrowUp("f0aa"), circleArrowDown("f0ab"), globe(
            "f0ac"), wrench("f0ad"), tasks("f0ae"), filter("f0b0"), briefcase(
            "f0b1"), fullscreen("f0b2"), group("f0c0"), link("f0c1"), cloud(
            "f0c2"), beaker("f0c3"), cut("f0c4"), copy("f0c5"), paperClip(
            "f0c6"), save("f0c7"), signBlank("f0c8"), reorder("f0c9"), listUl(
            "f0ca"), listOl("f0cb"), strikethrough("f0cc"), underline("f0cd"), table(
            "f0ce"), magic("f0d0"), truck("f0d1"), pinterest("f0d2"), pinterestSign(
            "f0d3"), googlePlusSign("f0d4"), googlePlus("f0d5"), money("f0d6"), caretDown(
            "f0d7"), caretUp("f0d8"), caretLeft("f0d9"), caretRight("f0da"), columns(
            "f0db"), sort("f0dc"), sortDown("f0dd"), sortUp("f0de"), envelope(
            "f0e0"), linkedin("f0e1"), undo("f0e2"), legal("f0e3"), dashboard(
            "f0e4"), commentAlt("f0e5"), commentsAlt("f0e6"), bolt("f0e7"), sitemap(
            "f0e8"), umbrella("f0e9"), paste("f0ea"), lightbulb("f0eb"), exchange(
            "f0ec"), cloudDownload("f0ed"), cloudUpload("f0ee"), userMd("f0f0"), stethoscope(
            "f0f1"), suitcase("f0f2"), bellAlt("f0f3"), coffee("f0f4"), food(
            "f0f5"), fileTextAlt("f0f6"), building("f0f7"), hospital("f0f8"), ambulance(
            "f0f9"), medkit("f0fa"), fighterJet("f0fb"), beer("f0fc"), hSign(
            "f0fd"), plusSignAlt("f0fe"), doubleAngleLeft("f100"), doubleAngleRight(
            "f101"), doubleAngleUp("f102"), doubleAngleDown("f103"), angleLeft(
            "f104"), angleRight("f105"), angleUp("f106"), angleDown("f107"), desktop(
            "f108"), laptop("f109"), tablet("f10a"), mobilePhone("f10b"), circleBlank(
            "f10c"), quoteLeft("f10d"), quoteRight("f10e"), spinner("f110"), circle(
            "f111"), reply("f112"), githubAlt("f113"), folderCloseAlt("f114"), folderOpenAlt(
            "f115"), expandAlt("f116"), collapseAlt("f117"), smile("f118"), frown(
            "f119"), meh("f11a"), gamepad("f11b"), keyboard("f11c"), flagAlt(
            "f11d"), flagCheckered("f11e"), terminal("f120"), code("f121"), replyAll(
            "f122"), mailReplyAll("f122"), starHalfEmpty("f123"), locationArrow(
            "f124"), crop("f125"), codeFork("f126"), unlink("f127"), question(
            "f128"), info("f129"), exclamation("f12a"), superscript("f12b"), subscript(
            "f12c"), eraser("f12d"), puzzlePiece("f12e"), microphone("f130"), microphoneOff(
            "f131"), shield("f132"), calendarEmpty("f133"), fireExtinguisher(
            "f134"), rocket("f135"), maxcdn("f136"), chevronSignLeft("f137"), chevronSignRight(
            "f138"), chevronSignUp("f139"), chevronSignDown("f13a"), html5(
            "f13b"), css3("f13c"), anchor("f13d"), unlockAlt("f13e"), bullseye(
            "f140"), ellipsisHorizontal("f141"), ellipsisVertical("f142"), rssSign(
            "f143"), playSign("f144"), ticket("f145"), minusSignAlt("f146"), checkMinus(
            "f147"), levelUp("f148"), levelDown("f149"), checkSign("f14a"), editSign(
            "f14b"), externalLinkSign("f14c"), shareSign("f14d"), compass(
            "f14e"), collapse("f150"), collapseTop("f151"), expand("f152"), eur(
            "f153"), gbp("f154"), usd("f155"), inr("f156"), jpy("f157"), cny(
            "f158"), krw("f159"), btc("f15a"), file("f15b"), fileText("f15c"), sortByAlphabet(
            "f15d"), sortByAlphabetAlt("f15e"), sortByAttributes("f160"), sortByAttributesAlt(
            "f161"), sortByOrder("f162"), sortByOrderAlt("f163"), thumbsUp(
            "f164"), thumbsDown("f165"), youtubeSign("f166"), youtube("f167"), xing(
            "f168"), xingSign("f169"), youtubePlay("f16a"), dropbox("f16b"), stackexchange(
            "f16c"), instagram("f16d"), flickr("f16e"), adn("f170"), bitbucket(
            "f171"), bitbucketSign("f172"), tumblr("f173"), tumblrSign("f174"), longArrowDown(
            "f175"), longArrowUp("f176"), longArrowLeft("f177"), longArrowRight(
            "f178"), apple("f179"), windows("f17a"), android("f17b"), linux(
            "f17c"), dribbble("f17d"), skype("f17e"), foursquare("f180"), trello(
            "f181"), female("f182"), male("f183"), gittip("f184"), sun("f185"), moon(
            "f186"), archive("f187"), bug("f188"), vk("f189"), weibo("f18a"), renren(
            "f18b");

    private String utf;

    private TouchKitIcon(String utfcode) {
        this.utf = utfcode;
    };

    public void addTo(Tab t) {
        if (t instanceof AbstractComponent) {
            addTo((AbstractComponent) t);
        } else {
            throw new IllegalArgumentException(
                    "Only TabBarView Tabs are currently supported.");
        }
    }

    public void addTo(AbstractComponent c) {
        // TODO consider creating an addon that handles this stuff on cliet
        // side, same rules would be introduced just once

        String stylename = "fa-" + name();
        c.addStyleName(stylename);
        StringBuilder sb = new StringBuilder(".");
        if (!hasInternalCaption(c)) {
            sb.append("v-caption-");
        } else {
            if (c instanceof NavigationButton) {
                sb.append("v-touchkit-navbutton-");
            } else if (c instanceof Button) {
                sb.append("v-button-");
            } else {
                throw new IllegalArgumentException("Given component is not supported by " + getClass().getSimpleName());
            }
        }
        sb.append(stylename);

        if (c instanceof Button) {
            sb.append(" .v-button-wrap");
        }
        sb.append(":before");
        sb.append(" { font-family: 'TkIcons' ;content:\"\\");
        sb.append(utf);
        sb.append("\";");
        if (hasInternalCaption(c)) {
            if (c instanceof NavigationButton) {
                sb.append("font-size:20px;font-weight:normal; vertical-align:middle; line-height:1; margin-right:10px;");
            } else if (c instanceof Button) {
                sb.append("font-size:24px;font-weight:normal;");
                if(isTabBarButton(c)) {
                    sb.append("line-height:40px;");
                } else {
                    sb.append("line-height:45px;");
                }
            }
        } else {
            sb.append("margin-left:10px;font-size:20px;");
        }
        sb.append("}");
        sb.append(".v-touchkit-componentgroup-row>.v-caption-");
        sb.append(stylename);
        sb.append(":before {");
        sb.append("margin-right:10px;margin-left:0;");
        sb.append("}");
        if (c instanceof Button) {
            sb.append(" .v-touchkit-navbar ");
            sb.append(".");
            sb.append(stylename);
            sb.append(" .v-button-wrap:before {");
            sb.append("line-height:24px;vertical-align:-4px;");
            sb.append("}");
        }

        Page.getCurrent().getStyles().add(sb.toString());
    }

    private boolean isTabBarButton(AbstractComponent c) {
        try {
            return c.getParent().getParent() instanceof TabBarView;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean hasInternalCaption(AbstractComponent c) {
        if (c instanceof Button) {
            return true;
        }
        if (c instanceof NavigationButton) {
            return true;
        }
        return false;
    }
}
