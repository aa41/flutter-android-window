// Autogenerated from Pigeon (v1.0.19), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package qiuxiang.android_window;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Pigeon {

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class MainApiCodec extends StandardMessageCodec {
    public static final MainApiCodec INSTANCE = new MainApiCodec();
    private MainApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface MainApi {
    void canDrawOverlays(Result<Boolean> result);
    void requestPermission(Result<Void> result);
    void isRunning(Result<Boolean> result);
    void post(Map<Object, Object> message, Result<Map<Object, Object>> result);
    void position(Result<Map<Object, Object>> result);
    @NonNull void open(String entry, Long width, Long height, Long x, Long y, Boolean focusable);
    @NonNull void close();

    /** The codec used by MainApi. */
    static MessageCodec<Object> getCodec() {
      return MainApiCodec.INSTANCE;
    }

    /** Sets up an instance of `MainApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, MainApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.canDrawOverlays", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Boolean> resultCallback = new Result<Boolean>() {
                public void success(Boolean result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.canDrawOverlays(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.requestPermission", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Void> resultCallback = new Result<Void>() {
                public void success(Void result) {
                  wrapped.put("result", null);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.requestPermission(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.isRunning", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Boolean> resultCallback = new Result<Boolean>() {
                public void success(Boolean result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.isRunning(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.post", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Map<Object, Object> messageArg = (Map<Object, Object>)args.get(0);
              if (messageArg == null) {
                throw new NullPointerException("messageArg unexpectedly null.");
              }
              Result<Map<Object, Object>> resultCallback = new Result<Map<Object, Object>>() {
                public void success(Map<Object, Object> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.post(messageArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.position", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<Map<Object, Object>> resultCallback = new Result<Map<Object, Object>>() {
                public void success(Map<Object, Object> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.position(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.open", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              String entryArg = (String)args.get(0);
              if (entryArg == null) {
                throw new NullPointerException("entryArg unexpectedly null.");
              }
              Number widthArg = (Number)args.get(1);
              if (widthArg == null) {
                throw new NullPointerException("widthArg unexpectedly null.");
              }
              Number heightArg = (Number)args.get(2);
              if (heightArg == null) {
                throw new NullPointerException("heightArg unexpectedly null.");
              }
              Number xArg = (Number)args.get(3);
              if (xArg == null) {
                throw new NullPointerException("xArg unexpectedly null.");
              }
              Number yArg = (Number)args.get(4);
              if (yArg == null) {
                throw new NullPointerException("yArg unexpectedly null.");
              }
              Boolean focusableArg = (Boolean)args.get(5);
              if (focusableArg == null) {
                throw new NullPointerException("focusableArg unexpectedly null.");
              }
              api.open(entryArg, widthArg.longValue(), heightArg.longValue(), xArg.longValue(), yArg.longValue(), focusableArg);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainApi.close", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.close();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class AndroidWindowApiCodec extends StandardMessageCodec {
    public static final AndroidWindowApiCodec INSTANCE = new AndroidWindowApiCodec();
    private AndroidWindowApiCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface AndroidWindowApi {
    void post(Map<Object, Object> message, Result<Map<Object, Object>> result);
    @NonNull void resize(Long width, Long height);
    @NonNull void setPosition(Long x, Long y);
    @NonNull void dragStart();
    @NonNull void dragEnd();
    @NonNull void close();
    @NonNull void launchApp();

    /** The codec used by AndroidWindowApi. */
    static MessageCodec<Object> getCodec() {
      return AndroidWindowApiCodec.INSTANCE;
    }

    /** Sets up an instance of `AndroidWindowApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, AndroidWindowApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.post", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Map<Object, Object> messageArg = (Map<Object, Object>)args.get(0);
              if (messageArg == null) {
                throw new NullPointerException("messageArg unexpectedly null.");
              }
              Result<Map<Object, Object>> resultCallback = new Result<Map<Object, Object>>() {
                public void success(Map<Object, Object> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.post(messageArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.resize", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number widthArg = (Number)args.get(0);
              if (widthArg == null) {
                throw new NullPointerException("widthArg unexpectedly null.");
              }
              Number heightArg = (Number)args.get(1);
              if (heightArg == null) {
                throw new NullPointerException("heightArg unexpectedly null.");
              }
              api.resize(widthArg.longValue(), heightArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.setPosition", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number xArg = (Number)args.get(0);
              if (xArg == null) {
                throw new NullPointerException("xArg unexpectedly null.");
              }
              Number yArg = (Number)args.get(1);
              if (yArg == null) {
                throw new NullPointerException("yArg unexpectedly null.");
              }
              api.setPosition(xArg.longValue(), yArg.longValue());
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.dragStart", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.dragStart();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.dragEnd", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.dragEnd();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.close", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.close();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowApi.launchApp", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.launchApp();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class AndroidWindowHandlerCodec extends StandardMessageCodec {
    public static final AndroidWindowHandlerCodec INSTANCE = new AndroidWindowHandlerCodec();
    private AndroidWindowHandlerCodec() {}
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class AndroidWindowHandler {
    private final BinaryMessenger binaryMessenger;
    public AndroidWindowHandler(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return AndroidWindowHandlerCodec.INSTANCE;
    }

    public void handler(Map<Object, Object> messageArg, Reply<Map<Object, Object>> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AndroidWindowHandler.handler", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(messageArg)), channelReply -> {
        @SuppressWarnings("ConstantConditions")
        Map<Object, Object> output = (Map<Object, Object>)channelReply;
        callback.reply(output);
      });
    }
  }
  private static class MainHandlerCodec extends StandardMessageCodec {
    public static final MainHandlerCodec INSTANCE = new MainHandlerCodec();
    private MainHandlerCodec() {}
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class MainHandler {
    private final BinaryMessenger binaryMessenger;
    public MainHandler(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return MainHandlerCodec.INSTANCE;
    }

    public void handler(Map<Object, Object> messageArg, Reply<Map<Object, Object>> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.MainHandler.handler", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(messageArg)), channelReply -> {
        @SuppressWarnings("ConstantConditions")
        Map<Object, Object> output = (Map<Object, Object>)channelReply;
        callback.reply(output);
      });
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
