class StationProcessor
!!!152322.java!!!	StationProcessor(inout layer : GeoLayer<Layer>)
        this.layer = layer;
!!!152450.java!!!	StationProcessor(inout layer : GeoLayer<Layer>, inout tStation : TStation)
        this.layer = layer;
        this.tStation = tStation;
!!!152578.java!!!	processCreated(in id : int, inout input : TObject) : GObject
        tStation = (TStation) input;
        gStation = new GStation(id, tStation);
        return gStation;
!!!152706.java!!!	processUpdated(in id : int, inout input : TObject, inout output : GObject) : GObject
        tStation = (TStation) input;
        gStation = (GStation) output;
        gStation.setLocation(tStation.getLocation());
        return output;
!!!152834.java!!!	processDeleted(in id : int, inout input : TObject, inout output : GObject) : GObject
        // Nothing to do here
        return output;
!!!152962.java!!!	getLayer() : GeoLayer<Layer>
        return this.layer;
!!!153090.java!!!	getType() : Class<? extends TObject>
        return TStation.class;
