package org.chromium.base.library_loader;
import org.chromium.base.annotations.SuppressFBWarnings;

@SuppressFBWarnings
public class NativeLibraries {
    public static boolean sUseLinker = false;
    public static boolean sUseLibraryInZipFile = false;
    public static boolean sEnableLinkerTests = false;
    public static final String[] LIBRARIES =
      {        "display_types.cr","base.cr","base_i18n.cr",
              "blink_common.cr","blink_core.cr","blink_modules.cr","device_core.cr",
              "blink_platform.cr","blink_web.cr","bluetooth.cr","accessibility.cr",

              "boringssl.cr","captive_portal.cr","capture.cr",

              "cc.cr","cc_blink.cr","cc_ipc.cr",

              "cc_proto.cr","cc_surfaces.cr","chrome.cr",
              "chromium_sqlite3.cr","cloud_policy_proto_generated_compile.cr","common.cr",

              "compositor.cr","content.cr","crcrypto.cr",

              "c++_shared","device_event_log.cr",
              "devices.cr","device_vibration.cr","device_vr.cr",
              "display.cr","display_compositor.cr",

              "display_util.cr","domain_reliability.cr","events.cr",
              "events_base.cr","events_ipc.cr","ffmpeg.cr",
              "geometry.cr","gesture_detection.cr","gfx.cr",

              "gfx_ipc.cr","gfx_ipc_geometry.cr","gfx_ipc_skia.cr",
              "gin.cr","gles2_c_lib.cr","gles2_implementation.cr",

              "gles2_utils.cr","gl_init.cr","gl_wrapper.cr",
              "gpu.cr","icui18n.cr","icuuc.cr",

              "ipc.cr","keyed_service_content.cr","keyed_service_core.cr",
              "media.cr","media_blink.cr","media_gpu.cr",
              "media_mojo_services.cr","message_center.cr","message_pump.cr",

              "midi.cr","mojo_common_lib.cr","mojo_public_system.cr",
              "mojo_system_impl.cr","native_theme.cr","net.cr",
              "net_with_v8.cr","onc.cr","platform.cr",
              "policy_component.cr","policy_proto.cr","power_save_blocker.cr",

              "prefs.cr","printing.cr","protobuf_lite.cr",

              "protocol.cr","proxy_config.cr","range.cr",
              "sandbox_services.cr","scheduler.cr","seccomp_bpf.cr",
              "seccomp_bpf_helpers.cr","sessions.cr","shared_memory_support.cr",

              "shell_dialogs.cr","skia.cr","snapshot.cr",
              "sql.cr","startup_tracing.cr","storage_browser.cr",

              "storage_common.cr","surface.cr","sync.cr",
              "tracing.cr","translator.cr","ui_android.cr",

              "ui_base.cr","ui_base_ime.cr","ui_data_pack.cr",
              "ui_touch_selection.cr","url.cr","url_ipc.cr",
              "url_matcher.cr","user_prefs.cr","v8.cr",
              "webdata_common.cr","web_dialogs.cr","wtf.cr"

      };
    static String sVersionNumber =
      "54.0.2789.0";
}
