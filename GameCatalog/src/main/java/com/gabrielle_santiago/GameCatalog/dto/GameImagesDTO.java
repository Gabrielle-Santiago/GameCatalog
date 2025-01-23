package com.gabrielle_santiago.GameCatalog.dto;

import java.util.List;

public class GameImagesDTO {

    private BoxImagesDTO box;
    private SquareImagesDTO square;
    private MastheadImagesDTO masthead;
    private BannerImagesDTO banner;
    private LogoImagesDTO logo;
    private List<ScreenshotDTO> screenshots;

    public BoxImagesDTO getBox() {
        return box;
    }

    public void setBox(BoxImagesDTO box) {
        this.box = box;
    }

    public SquareImagesDTO getSquare() {
        return square;
    }

    public void setSquare(SquareImagesDTO square) {
        this.square = square;
    }

    public MastheadImagesDTO getMasthead() {
        return masthead;
    }

    public void setMasthead(MastheadImagesDTO masthead) {
        this.masthead = masthead;
    }

    public BannerImagesDTO getBanner() {
        return banner;
    }

    public void setBanner(BannerImagesDTO banner) {
        this.banner = banner;
    }

    public LogoImagesDTO getLogo() {
        return logo;
    }

    public void setLogo(LogoImagesDTO logo) {
        this.logo = logo;
    }

    public List<ScreenshotDTO> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<ScreenshotDTO> screenshots) {
        this.screenshots = screenshots;
    }

    public static class BoxImagesDTO {
        private String og;
        private String sm;

        public String getOg() {
            return og;
        }

        public void setOg(String og) {
            this.og = og;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }
    }

    public static class SquareImagesDTO {
        private String og;
        private String xs;
        private String sm;
        private String lg;

        public String getOg() {
            return og;
        }

        public void setOg(String og) {
            this.og = og;
        }

        public String getXs() {
            return xs;
        }

        public void setXs(String xs) {
            this.xs = xs;
        }

        public String getSm() {
            return sm;
        }

        public void setSm(String sm) {
            this.sm = sm;
        }

        public String getLg() {
            return lg;
        }

        public void setLg(String lg) {
            this.lg = lg;
        }
    }

    public static class MastheadImagesDTO {
        private String og;
        private String xs;
        private String sm;
        private String md;
        private String lg;
        private String xl;

        public String getOg() {
            return og;
        }
        public void setOg(String og) {
            this.og = og;
        }
        public String getXs() {
            return xs;
        }
        public void setXs(String xs) {
            this.xs = xs;
        }
        public String getSm() {
            return sm;
        }
        public void setSm(String sm) {
            this.sm = sm;
        }
        public String getMd() {
            return md;
        }
        public void setMd(String md) {
            this.md = md;
        }
        public String getLg() {
            return lg;
        }
        public void setLg(String lg) {
            this.lg = lg;
        }
        public String getXl() {
            return xl;
        }
        public void setXl(String xl) {
            this.xl = xl;
        }

    }

    public static class BannerImagesDTO {
        private String og;
        private String sm;

        public String getOg() {
            return og;
        }
        public void setOg(String og) {
            this.og = og;
        }
        public String getSm() {
            return sm;
        }
        public void setSm(String sm) {
            this.sm = sm;
        }

    }

    public static class LogoImagesDTO {
        private String og;

        public String getOg() {
            return og;
        }

        public void setOg(String og) {
            this.og = og;
        }
    }

    public static class ScreenshotDTO {
        private String og;
        private String sm;

        public String getOg() {
            return og;
        }
        public void setOg(String og) {
            this.og = og;
        }
        public String getSm() {
            return sm;
        }
        public void setSm(String sm) {
            this.sm = sm;
        }

    }
}
